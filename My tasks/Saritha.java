class Saritha
{ 
	String email;
	Clip clip;
	
	Saritha(String email,Clip clip)
	{
		this.email=email;
		this.clip=clip;
		System.out.println("created Clip using String and Clip");
	}
	public void details()
	{
		this.clip.details();
		System.out.println("Saritha email:"+this.email);
	
	}
}