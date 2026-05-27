class First_No
{
	public static void main (String args[])
	{
		Demo d1= new Demo();
		System.out.println(d1.firstNo(1976));
	}
}


class Demo
{
	int firstNo(int n)
	    {
		while(n>10)
		{
			n/=10;
		}
		return n;
	    }
}

		

	
		