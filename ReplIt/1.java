import java.util.Scanner;

class Main
{
	public static void main(String[] args)
	{
		String str = "";

		Scanner input = new Scanner(System.in);
		int num = 0;
		while (num == 0)
		{
			System.out.print("Введите количество элементов:");
			str = input.nextLine();
			boolean bool = true;
			for (int i = 0; i < str.length(); i++)
			{
					if ( !Character.isDigit(str.charAt(i)) )
					{
						bool = false;
					}
			}
			if (bool)
			{
				num = Integer.parseInt(str);
			}
		}

		String [] arr = new String [num];
		for (int i = 0; i < arr.length; i++)
		{
			System.out.print("Введите " + i + " элемент массива:");
			str = input.nextLine();
			arr[i] = str;
		}

		for (int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i].charAt(0));
		}
	}
}
