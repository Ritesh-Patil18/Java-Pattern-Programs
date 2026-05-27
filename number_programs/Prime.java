class Prime
{
	boolean PrimeNo(int n)
	{
		Boolean b=false;
		if (n==0 || n==1)
		
			b= true;
		else
			for(int i=2; i<=n/2; i++)
				if(n%i==0)
				{
					b=true;
					break;
				}
		return !b;
	}
}
		
		  