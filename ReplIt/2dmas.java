class Main
{
	public static void main(String[] args)
	{
		int[][] a = {
			{1,2,3},
			{4,5,6},
			{1,3,5}
		};
		System.out.println(sum2D(a)); //should print 30
	}

	public static int sum2D(int[][] nums)
	{
		int result = 0;
		for (int i = 0; i < nums.length; i++)
		{
			for (int j = 0; j < nums[0].length; j++)
			{
				result = result + nums[i][j];
			}
		}
		return result;
	}
}

class Main
{
	public static void main(String[] args)
	{
		int[][] a = {
			{1,2,3,4},
			{4,5,6,7},
			{1,3,5,7}
		};
		reduce10(a);
		//print the Array
		for(int[] row : a){
			for(int e : row){
				System.out.print(e + " ");
			}
			System.out.println();
		}
	}

	public static void reduce10(int[][] nums)
	{
		for (int i = 0; i < nums.length; i++)
		{
			for (int j = 0; j < nums[0].length; j++)
			{
				nums[i][j] = nums[i][j] - 10;
			}
		}
	}
}

class Main
{
	public static void main(String[] args)
	{
		int[][] a = {
			{14,20,3,2},
			{4,15,6,1},
			{12,31,4,16}
		};
		System.out.println(mystery(a,3,4)); //should print 5
		//prints array
		for(int[] row : a){
			for(int e : row){
				System.out.print(e + " ");
			}
			System.out.println();
		}
	}

	public static int mystery(int[][] nums, int rows, int cols)
	{
		int result = 0;
		for (int i = 0; i < nums.length; i++)
		{
			for (int j = 0; j < nums[0].length; j++)
			{
				nums[i][j] = ( nums[i][j] - nums[i][j] % 3 ) / 3;
				if ( nums[i][j] % 2 != 0 )
				{
					result++ ;
				}
			}
		}
		return result;
	}
}

class Main
{
	public static void main(String[] args)
	{
		int[][] a = {
			{5,2,3,7},
			{1,5,1,1},
			{8,3,1,2}
		};
		System.out.println(max2Delement(a)); //should be 8
	}
	public static int max2Delement(int[][] nums)
	{
		int result = -1;
		for (int i = 0; i < nums.length; i++)
		{
			for (int j = 0; j < nums[0].length; j++)
			{
				if ( nums[i][j] > result )
				{
					result = nums[i][j];
				}
			}
		}
		return result;
	}
}

class Main
{
	public static void main(String[] args)
	{
		int[][] a = {
			{-5,-2,-3,7},
			{1,-5,-2,2},
			{1,-2,3,-4}
		};
		System.out.println(countNegativeOdd(a)); //should print 3
	}
	public static int countNegativeOdd(int[][] nums)
	{
		int result = 0;
		for (int i = 0; i < nums.length; i++)
		{
			for (int j = 0; j < nums[0].length; j++)
			{
				if ( ( nums[i][j] < 0 ) & ( nums[i][j] % 2 != 0 ) )
				{
					result++;
				}
			}
		}
		return result;
	}
}
