class Demo
{
	int lastDigit(int n)
	{
		return n%10;
	}
}

class Last_Digit
{
	public static void main (String args[])
	{
		Demo d1 = new Demo();
		System.out.println(d1.lastDigit(4359));
	}
}