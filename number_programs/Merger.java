class Demo
{
	int mergerDigits(int a, int b)
		{
			int temp=b;
			while(temp!=0)
			{
				a*=10;
				temp/=10;
			}
			return a+b;
		}
}

class Merger
{
	public static void main(String args[])
	{
		Demo d1= new Demo();
		int a=d1.mergerDigits(987,456);
		System.out.println(a);
	}
}
			