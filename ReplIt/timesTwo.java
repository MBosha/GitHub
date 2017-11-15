import java.util.ArrayList;

class Main
{
	public static void main(String[] args)
	{
		ArrayList<Integer> aList = new ArrayList<Integer>();

		aList.add(1);
		aList.add(2);
		aList.add(3);
		aList.add(4);
		aList.add(5);

		arrPrint(aList);
		timesTwo (aList);
		arrPrint(aList);
	}


	//create your method below
	public static void arrPrint ( ArrayList <Integer> arrList )
	{
		for (Integer element:arrList)
		{
			System.out.print(element);
			System.out.print(" ");
		}
		System.out.println();
	}

	public static void timesTwo ( ArrayList <Integer> arrList )
	{
		for (int i = 0; i < arrList.size(); i++)
		{

			int num = arrList.get(i);
			num = num * 2;
			arrList.set(i, num);
		}
	}
}
