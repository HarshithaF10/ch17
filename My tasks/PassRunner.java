class PassRunner
{
	public static void main(String[] person)
	{
		if(person.length==4)
		{
			String name=person[0];
			String email=person[1];
			String age=person[2];
			String password=person[3];
			
			System.out.println("name:"+name);
			System.out.println("email:"+email);
			System.out.println("age:"+age);
			System.out.println("password:"+password);
		}
		else{
			System.out.println("required 4 arguments");
		}
	}
			
}