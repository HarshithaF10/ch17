class Cot{
	//declaring 5 static methods
	public static void pillow()
	{
		System.out.println("running pillow in Restorant");
		bed();
		blancket();
	}
	public static void bed()
	{
		System.out.println("running bed in Restorant");
	}
	public static void blancket()
	{
		System.out.println("running blancket in Restorant");
	}
	public static void bedsheet()
	{
		System.out.println("running bedsheet in Restorant");
	}
	public static void lamp()
	{
		System.out.println("running lamp in Restorant");
		bedsheet();
	} 
}