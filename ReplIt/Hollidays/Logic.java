import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.ArrayList;

public class Logic
{
	public static ArrayList<String> result = new ArrayList<String>();
	String strLogic;

	public Logic (String str)
	{
		this.strLogic = str;
	}

	public static ArrayList<String> formatText (String str)
	{
		String symbol = "�";
		//String istochnikCp = new String ("Источник", "Cp1251");
		String istochnik = "��������";
		String [] numbers = {"0","1","2","3","4","5","6","7","8","9"};
		boolean exit = true;

		//отрезаем дату
		for ( int i = 0; i < str.length(); i++ )
		{
			if ( i < str.length() )
			{
				if ( str.substring( i, i + 1 ).equals(symbol) )
				{
					result.add ( "*" + str.substring( 0, i ).trim() + "*" );
					str = str.substring( i, str.length() );
					break;
				}
			}
		}

		//отрезаем "Источник..."
		for ( int i = 0; i < str.length(); i++ )
		{
			if ( i < str.length() - istochnik.length() )
			{
				if ( str.substring( i, i + istochnik.length() ).equals(istochnik) )
				{
					str = str.substring( 0, i );
					break;
				}
			}
		}

		//делим на строки
		while ( exit )
		{
			for ( int i = 1; i < str.length(); i++ )
			{
				if ( i < str.length() - 1 )
				{
					if ( str.substring( i, i + 1 ).equals( symbol ) )
					{
							result.add ( str.substring( 0, i - 1 ).trim() );
							str = str.substring( i, str.length() );
							break;
					}
				}
				if ( i == str.length() - 1 )
					{
						exit = false;
						if ( str.substring( 0, 1 ).equals( symbol ) )
						{
							result.add ( str.substring( 0, str.length() ).trim() );
						}
					}
			}
		}

		//отрезаем года/лет

		for ( int s = 1; s < result.size(); s++ )
			{
				String strDel = result.get ( s );
				for ( int i = 0; i < strDel.length() - 1; i++ )
				{
					if (	strDel.substring( i, i + 1 ).equals( numbers [0] ) ||
								strDel.substring( i, i + 1 ).equals( numbers [1] ) ||
								strDel.substring( i, i + 1 ).equals( numbers [2] ) ||
								strDel.substring( i, i + 1 ).equals( numbers [3] ) ||
								strDel.substring( i, i + 1 ).equals( numbers [4] ) ||
								strDel.substring( i, i + 1 ).equals( numbers [5] ) ||
								strDel.substring( i, i + 1 ).equals( numbers [6] ) ||
								strDel.substring( i, i + 1 ).equals( numbers [7] ) ||
								strDel.substring( i, i + 1 ).equals( numbers [8] ) ||
								strDel.substring( i, i + 1 ).equals( numbers [9] )
							)
					{
						result.set ( s, strDel.substring( 0, i - 2 ) );
					}
				}
			}

		return result;
	}

	//печатаем
	public static void printResult (ArrayList<String> arr)
	{
		System.out.println();
		if ( arr.size() == 0 )
		{
			System.out.println("Не верно введена строка!!!");
		}
		for (String element:arr)
		{
			System.out.println(element);
		}
	}


}
