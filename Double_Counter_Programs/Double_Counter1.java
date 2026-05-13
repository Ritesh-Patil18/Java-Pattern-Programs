class Double_Counter1
{
	public static void main (String args[])
	{
		int n=5;
		int count=1;
		int count1= n*(n+1)/2;
		
		for(int i=n; i>=1; i--)
		{	
			int c=count;
			int c1=count1;
			for(int j=i; j>=1; j--)
			{
				System.out.print((char)(c+64));
				System.out.print((char)(c1+96));
				System.out.print("\t"); 
				c++;
				c1--;
			}
			System.out.println();
			count+=i;
			count1-=i;
		}
	}
}
				 