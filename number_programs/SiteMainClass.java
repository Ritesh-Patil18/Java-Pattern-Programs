class SiteMainClass
{
	public static void main(String args[])
	{
		System.out.println("Program Started ");
		Site s = new Site();
	
		try{
			s.login(45);
		   }
		catch(RuntimeException  e)
		{
			System.out.println(e);
		}
		System.out.println("Program Ended");
	}
}
		