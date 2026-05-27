class Triangle_Alpha9
{
	public static void main(String args[])
	{
		int n=9;
		for(int i=n; i>=1; i--)
		{
			for(int j=n; j>=i; j--)
			{
				System.out.print((char)(j+64));
			}
			System.out.println();
		}
	}
}



