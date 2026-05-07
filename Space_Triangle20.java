/*
ABCDE
 ABCD
  ABC
   AB
    A
*/
class Space_Triangle20
{
	public static void main(String args[])
	{
	  int n=5;
	  for(int i=n; i>=1; i--)
		{
		  for(int j=n; j>i; j--)
		  {
			System.out.print(" ");
		  }
		  for(int j=1; j<=i; j++)
		   {
			System.out.print((char)(i+64));
		    }
		System.out.println();
		}
	}
}