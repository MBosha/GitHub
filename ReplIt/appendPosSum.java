import java.util.ArrayList;

class Main
{
	public static void main(String[] args)
	{

	}
	//create your method below
	public static ArrayList <Integer> appendPosSum ( ArrayList <Integer> arrList )
	{
		ArrayList<Integer> result = new ArrayList<Integer>();
		int sum = 0;
		for (Integer element:arrList)
		{
			if ( element > 0 )
			{
				result.add(element);
				sum += element;
			}
		}
		result.add(sum);
		return result;
	}
