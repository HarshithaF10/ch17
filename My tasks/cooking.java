class cooking
{
	public static int dishItems(int number)
	{
		System.out.println("running items in cooking");
		System.out.println("number is:"+number);
		if(number>500)
		{
			return 1;
		}
		else if(number<50 && number>0)
		{
			return 0;		
		}
		return 0;
	}
	
	
	
	public static String vegetable(String name)
	{
		System.out.println("running vegetable in cooking");
		System.out.println("vegetable is:"+name);
		if(name=="carrot")
		{
			return "name is correct";
		}
		else
		{
			return "its not correct";		
		}
	}
		
		
	public static void recepie(String dish)
	{
		System.out.println("running recepie in cooking");
		System.out.println("dish is:"+dish);
		if(dish=="sambar")
		{
			return;
		}
		else if(dish=="rasam")
		{
			return;		
		}
		return;
	}
}




class cookingRunner
{
	public static void main(String[] args)
	{
		System.out.println("running main in cookingRunner");
		int ref=dishItems(46);
		String ref1=vegetable("raddish");
		recepie("sambar");
		
	}
}