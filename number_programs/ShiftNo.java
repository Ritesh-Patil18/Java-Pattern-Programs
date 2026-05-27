class ShiftNo
{	
	int ShiftFirstToLast(int n)
		{
		    int last=n%10;
			n/=10;
			int temp = n;
			while (temp !=0)
			{
				temp/=10;
				last*=10;
			}
			return n+last;
		}
} 
			