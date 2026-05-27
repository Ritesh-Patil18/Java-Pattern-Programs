class Number_Programs
{
	int SumOfDigits(int n)
	{
		int sum=0;
		while(n!=0)
		{
			sum+=n%10;
			n/10;
		}
		return sum;
	}
}

class NP
{
	public static void main(String args[])
	{
		Number_Program n1 = new Number_Program();
		System,out.println(n1.SumOfDigits(1234));
	}
}
		