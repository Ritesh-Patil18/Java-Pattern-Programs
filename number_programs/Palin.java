class Palin 
{
	boolean compare(int n)
	{
		int temp=n, sum=0;
		while(temp!=0)
		{
			sum*=10;
			sum+=temp%10;
			temp/=10;
		}
		return sum==n;
	}
}
		
		