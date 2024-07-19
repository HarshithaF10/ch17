class PalaceRunner
{
	public static void main(String[] palace)
	{
		if(palace.length==4)
		{
			System.out.println("==================");
			String name=palace[0];
			String location=palace[1];
			String builtBy=palace[2];
			String biuldYear=palace[3];
			
			System.out.println("name:"+name);
			System.out.println("location:"+location);
			System.out.println("builtBy:"+builtBy);
			System.out.println("biuldYear:"+biuldYear);
		}
		else{
			System.out.println("required 4 arguments");
		}
	}
}