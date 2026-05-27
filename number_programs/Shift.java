class Shift
{
	int shiftLastTOFirst(int n)
	{
		int first=n, length=1;
		while(first>9)
		{
			first/=10;
			length*=10;
		}
	n%=length;
	n*=10;
	return n+first;
	}
}