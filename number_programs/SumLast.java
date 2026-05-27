class SumLast
{
	int SumAtLast(int n)
	{
		int sum=0, temp=n;
		while(temp!=0)
		{	
			sum+=temp%10;
			temp/=10;
			
			
		}
		
	temp=sum;
		while(temp!=0)
		{
			n*=10;
			temp/=10;
		}
		return n+sum;
	}
}