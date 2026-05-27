class Strong
{
	Boolean StrongNo(int n)
	{
		int sum=0, temp=n;
		while(temp!=0)
		{
			int fact = 1;
			for(int i=1; i<=temp%10; i++)
				fact*=1;
			    sum+=fact;
			    temp/=10;
		}
		return sum==n;
	}
}