class PrimeNumber
{
	public static void main(String args[])
	{
		Prime p = new Prime();
		int count=0, count1=0;	
		for(int i=1; i<=100000; i++)	
		
		{
	         	System.out.println(p.PrimeNo(i)+" = "+i);
			if(p.PrimeNo(i)==true)
			{
				count++;
			}
			else
			{
				count1++;
			}
					
		}
		System.out.println(count+" numbers are Prime" );
		System.out.println(count1+" number are not prime " );
	}
}