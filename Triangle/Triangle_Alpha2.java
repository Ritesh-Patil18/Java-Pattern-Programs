class Triangle_Alpha2
{
	public static void main (String args[])	
	{
		int n=9;
		for(int i=1; i<=n; i++)
		{
			for(int j=n; j>=i; j--)
			{
				System.out.print((char)(i+64));
			}
			System.out.println();
		}
	}
} 
 