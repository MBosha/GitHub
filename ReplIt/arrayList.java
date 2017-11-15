import java.util.ArrayList;

class Main
{
	public static void main(String[] args)
	{

	}

	//create your method below
	public static ArrayList <String> combineAL ( ArrayList <String> wordList1, ArrayList <String> wordList2 )
	{
		ArrayList<String> result = new ArrayList<String>();
		for (String element:wordList1)
		{
			result.add(element);
		}
		for (String element:wordList2)
		{
			result.add(element);
		}
		return result;
	}
}