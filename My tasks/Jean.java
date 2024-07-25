class Jean
{
	int size;
	double cost=1000;
	String name;
}

class JeanRunner
{
	public static void main(String[] args)
	{
		Jean jean=new Jean();
		int jean1=jean.size;
		jean.name="wide Length";
		System.out.println("The name is:"+jean.name);
		
		double jean2=jean.cost;
		
		System.out.println("The cost is:"+jean.cost);
		String jean3=jean.name;
		jean.size=32;
		System.out.println("The size is:"+jean.size);
	}
}