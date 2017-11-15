class Main
{
	public static void main(String[] args)
	{
		int[][] a = {
			{1,1,1},
			{1,1,1},
			{1,1,1}
		};
		System.out.println(isMagic(a)); //true
		int[][] b = {
			{1,1,2},
			{3,2,3},
			{1,4,1}
		};
		System.out.println(isMagic(b)); //false
		int[][] c = {
			{1,1,1},
			{2,2,2}
		};
		System.out.println(isMagic(c)); //false
		int[][] d = {
			{8,1,6},
			{3,5,7},
			{4,9,2}
		};
		System.out.println(isMagic(d)); //true
	}
	public static boolean isMagic(int[][] array)
	{
		int x = array.length;
		int y = array[0].length;
		int mas [] = new int [x * 2 + 2];
		int mas_i = 0;

		if ( x != y )
		{
			return false;
		}

		//просчет строк
		for (int i = 0; i < x; i++)
		{
			for (int j = 0; j < y; j++)
			{
				//главная диагональ
				if ( i == j )
				{
					mas[mas.length - 2] = mas[mas.length - 2] + array[j][i];
				}
				mas[mas_i] = mas[mas_i] + array[i][j];
			}
			mas_i++;
		}

		//просчет столбцов
		for (int i = 0; i < x; i++)
		{
			for (int j = 0; j < y; j++)
			{
				mas[mas_i] = mas[mas_i] + array[j][i];
			}
			mas_i++;
		}

		//побочная диагональ
		for (int i = 0; i < x; i++)
		{
			for (int j = y - 1; j > -1; j--)
			{
				mas[mas.length - 1] = mas[mas.length - 1] + array[j][i];
				break;
			}
		}

		for (int i = 0; i < mas.length - 1; i++)
		{
			System.out.println( mas[i] );
		}


		for (int i = 0; i < mas.length - 1; i++)
		{
			if ( mas[i] != mas[i + 1] )
			{
				System.out.println( mas[i]  + " " + mas[i + 1]);
				return false;
			}
		}

		return true;
	}
}
