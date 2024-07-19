class MovieCounter
{
	public static void ticket(String name, int age)
	{
		System.out.println("name is:"+name);
		System.out.println("age is:"+age);
		
		if(age>18 && age<100)
		{
			System.out.println("Ticket is 1000");
		}
		else
		{
			System.out.println("Ticket is 500");
		}
	}
}

