class SumFirst
{
	int SumAtFirst(int n)
	{
		int sum=0, length=1, temp=n;
		while(temp!=0)
		{
			sum+=temp%10;
			temp/=10;
			length*=10;
		}
		sum*=length;
		return sum+n;
	}
}
		
			