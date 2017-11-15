class Main
{
	public static void main(String[] args)
	{
		int[] a = {2,7,3,8,4};
		System.out.println(avgElements(a)); //should print 4.8
	}
	public static double avgElements(int[] array)
	{
		double sum = 0;
		for (int i = 0; i < array.length; i++)
		{
			sum = sum + array [i];
		}

		return sum/array.length;
	}
}

class Main
{
	public static void main(String[] args)
	{
		int[] a = {1,2,3,4,5};
		mystery(a);
		for(int e : a)
		{
			System.out.print(e + " ");
		}
		// should print out 10 1 30 2 50
	}
	public static void mystery(int[] array)
	{
		for (int i = 0; i < array.length; i++)
		{
			if ( array[i] % 2 == 0 )
			{
				array[i] = array[i] / 2;
			}
			else
			{
				array[i] = array[i] * 10;
			}
		}
	}
}
