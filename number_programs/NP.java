class Number_Programs
{
	int SumOfDigits(int n)
	{
		int sum=0;
		while(n!=0)
		{
			sum+=n%10;
			n/=10;
		}
		return sum;
	}
}

class NP
{
	public static void main(String args[])
	{
		Number_Programs n1 = new Number_Programs();
		System.out.println(n1.SumOfDigits(123423235));
	}
}
		