class Double_Counter2
{
	public static void main(String args[])
	{
		int n=5;
		int count=1;
		int count1= n*(n+1)/2;
		for(int i=n; i>=1; i--) 
		{
			int c=count;
			int c1=count1;
			for(int j=i,j1=n; j<=n || j1>=i; j++, j1--)
			{
				System.out.print((char)(c+64));
				System.out.print((char)(c1+96));
				System.out.print("\t");
				c-=j;
				c1-=j1-1;
			}
			System.out.println();
			count+=i;
			count1--;
		}
	}
}
			