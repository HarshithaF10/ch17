class Vegitable
{
	public static void cost()
	{
		double price=78.54;
		String msg;
		System.out.println("price is:"+price);
		if(price>100 && price<5000)
		{
			msg=":price is costly";
			System.out.println(msg);
		}
		
		else
		{
			msg=":price is cheap";
			System.out.println(msg);
		}
	}

}


class VegitableRunner
{
	public static void main(String[] vegetable)
	{
		Vegitable.cost();
	}
}

