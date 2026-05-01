import java.util.Scanner;
class Trishul
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("Enter The Number To Print Trishul");
		System.out.println();
		System.out.println("==================================");
		System.out.println();
		System.out.print("Enter Your Number: ");
		int n = sc.nextInt();
		System.out.println();
		if(n%2==0)
		{
			n+=1;
		}
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=n; j++)
			{
				if(i==(n/2)+1 || j==(n/2)+1 || j==1&&i<=n/2 || j==n&&i<=n/2)
				{
					System.out.print(" *");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		for(int i=1; i<=n/2; i++)
		{
			for(int j=1; j<=n; j++)
			{	
				if(j==(n/2)+1)
				{
				System.out.print(" *");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();

		}
	}
}
		

		