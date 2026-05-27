class Demo
{
	
	int maxDigit (int n)
		{
			int max=0;
			while(n!=0)
			{
				int temp=n%10;
				if(max<temp)
				{
					max=temp;
				}
				n/=10;
			}
			return max;
		}
	
}

class Max
{
	public static void main(String args[])
	{
		Demo d1 = new Demo();
		System.out.println(d1.maxDigit(165456));
	}
}