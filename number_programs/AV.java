class SumAverage
{
	double averageNo(int n)
	{
		int sum=0, count=0;
		while(n!=0)
		{
			sum+=n%10;
			n/=10;
			count++;
		}
		return (double) sum/count;
			
	}
}

class AV 
{
	public static void main(String args[])
	{
		SumAverage d1=new SumAverage(	);
		System.out.println(d1.averageNo(12345));
	}
}
		