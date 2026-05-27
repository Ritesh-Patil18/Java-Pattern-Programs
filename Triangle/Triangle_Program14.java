class Triangle_Program14
{
	public static void main(String args[])
	{
		int n=9;
		for(int i=1; i<=n; i++)
		{
			for(int j=n; j>=i; j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}