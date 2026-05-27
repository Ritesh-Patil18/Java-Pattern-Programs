class Double_Counter4
{
	public static void main(String args[])
	{
		int n=5;
		int count=n;
		int count1= n*(n+1)/2;
		for(int i=1,i1=n; i<=n|| i1>=1;  i++, i1--)
		{
			for(int j=i; j<n; j++)
			{
				System.out.print("\t");
			}
			int c=count;
			int c1=count1;
			for(int j=n; j>=i1; j--)
			{
				System.out.print((char)(c+64));
				System.out.print((char)(c1+96));
				System.out.print("\t");
				c+=j;
				c1--;
			}
			System.out.println();
			count--;
			count1-=i;
			
		}
	}
}
			