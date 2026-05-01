import java.util.Scanner;
class Swastik
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("Print Dynamic Swastik By using patttern's Logic ");
		System.out.println("========================================================");
		System.out.println();
		System.out.print("Enter Your Number to Print Swastik : "); 
		int n=sc.nextInt();
		if(n%2==0)
		{
			n+=1;
		}
		int n1=n;
		for(int i=1; i<=n1; i++)
		{
			for(int j=1; j<=n1; j++)
			{
					if(i==(n1/2)+1 || j==(n1/2)+1 || j==1&&i<=n1/2 || i==1&&j>=(n1/2)+1 || i==n&&j<=n/2|| j==n&&i>=(n/2)+1)

					{
					System.out.print(" *");
					}
					else
					{
					System.out.print("  ");
					}	
			}
			System.out.println( );
		}
	}
}