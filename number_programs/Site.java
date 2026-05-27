class Site
{
	private void homepage()
	{
		System.out.println("Welcome to your Home!!!!");
	}
	public void login(int age)
	{
		System.out.println("Welcometo our site");
		if(age>80)
			homepage();
		else
			throw new NullPointerException();
		System.out.println("Thank You For Visit");
	}
}