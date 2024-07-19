class Vegitable
{
	public static void cost(double price)
	{
		System.out.println("price is:"+price);
		if(price>100 && price<50000)
		{
			System.out.println("price is costly");
		}
		else
		{
			System.out.println("price is cheap");
		}
	}
}
class VegitableRunner
{
	public static void main(String[] vegetable)
	{
		Vegitable.cost(100);
	}
}