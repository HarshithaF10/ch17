class Sof 
{
	public static void pen()
	{
		System.out.println("running pen in Restorant");
		paper();
	}
	public static void paper()
	{
		System.out.println("running paper in Restorant");
		pen();
	}
}
class SofRunner
{
	public static void main(String[] args)
	{
		Sof.pen();
		Sof.paper();
	}
}