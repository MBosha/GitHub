import java.util.ArrayList;

class Main
{
	public static void main(String[] args)
	{
		ArrayList<String> result = new ArrayList<String>();
		result.add("1");
		result.add("1");
		result.add("2");
		result.add("1");

		removeAll(result, "1");

		for (String element:result)
		{
			System.out.println(element);
		}
	}
	//create your method below
	public static void removeAll ( ArrayList <String> wordList, String targetWord )
	{

		for (int i = 0; i < wordList.size(); i++)
		{
			if ( wordList.get(i).equals(targetWord) )
			{
				wordList.remove (i);
				i--;
			}
		}
	}
}
