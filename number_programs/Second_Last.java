class Demo
{
	int secondLastDigit(int n)
	{
		n/=10;
		return n%10;
	}
}

class Second_Last
{
	public static void main (String args[])
	{
		Demo d1= new Demo();
		System.out.println(d1.secondLastDigit(2647));
	}
}