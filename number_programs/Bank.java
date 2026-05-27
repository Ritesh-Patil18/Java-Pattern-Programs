class Bank
{
	private void acc()
	{
		System.out.println("Welcome To Bank Of Bharat!!!");
	}
	public void amount(double n)
	{
		System.out.println("Welcome To internet banking");
			double balance=5000;
		if(balance >= n || n<= balance)
		{
			acc();
			System.out.println(" Your Account Balance is "+balance);
			balance-=n;
			System.out.println(" Your Account Balance After withdrawl "+balance);
		}
		else
		{
			System.out.println("Invalid Amount");	
		}
	}
	