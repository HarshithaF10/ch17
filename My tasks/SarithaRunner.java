class SarithaRunner
{
public static void main(String[] args)
{
    Clip clip=new Clip("Lavender","claw clip");

	Saritha saritha=new Saritha("saritha123@gmail.com",clip);
	saritha.details();
	
	Clip clip1=new Clip("Crimson","Bobby pins");
	 
	Saritha saritha1=new Saritha("ssg@gmail.com",clip1);
	saritha1.details();
	 
	Clip clip2=new Clip("Orchid","Banana clip");
	 
	Saritha saritha2=new Saritha("sanju@gmail.com",clip2);
	saritha2.details();
}
}