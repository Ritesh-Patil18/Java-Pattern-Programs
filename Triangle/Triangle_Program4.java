class Triangle_Program4
{
	public static void main( String args[])
	{
		int n=9;
		for(int i=1; i<=n; i++)
		{
			for(int j=n; j>=i; j--) /*for(int j=i; j<=n; j++)*/
			{
				System.out.print(i);
			}
			System.out.println();
		}
	}
}

	