class Phone
{
	public static void backcase()
		{
			System.out.println("running backcase in Phone");
		}
	public static void charger()
		{
			System.out.println("running charger in Phone");
		}
}
class PhoneRunner
{
	public static void main(String[] args)
	{
		Phone.backcase();
		Phone.charger();
	}
}