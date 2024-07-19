class Country
{
	public static void state(String[] state)
	{
		System.out.println("======================");
		System.out.println("running state in country");
		for(int name=0;name<state.length;name++)
		{
			String container=state[name];
			System.out.println("States are:"+container );
		}
		System.out.println("======================");
		for(int name=state.length-1;name>=0;name--)
		{
			String container1=state[name];
			System.out.println("States are:"+container1);
		}
	}
	
	public static void pincode(int[] pincode)
	{
		System.out.println("======================");
		System.out.println("running pincode in country");
		for(int area=0;area<pincode.length;area++)
		{
			int pin=pincode[area];
			System.out.println("codes are:"+pin);
		}
		System.out.println("======================");
		for(int area=pincode.length-1;area>0;area--)
			{
			int pin=pincode[area];
			System.out.println("codes are:"+pin);
		}
		
	}
	
	public static void primeminister(String[] primeminister)
	{
		System.out.println("======================");
		System.out.println("running primeminister in country");
		for(int num=0;num<primeminister.length;num++)
		{
			String names=primeminister[num];
			System.out.println("primeminister:"+names);
		}
		System.out.println("======================");
		for(int num=primeminister.length-1;num>=0;num--)
		{
			String names=primeminister[num];
			System.out.println("primeminister:"+names);
		}
		
	}
	
	public static void cabinetMinister(String[] cabinetMinister)
	{
		System.out.println("======================");
		System.out.println("running cabinetMinister in country");
		for(int list=0;list<cabinetMinister.length;list++)
		{
			String cabinet=cabinetMinister[list];
			System.out.println("primeminister:"+cabinet);
		}
		System.out.println("======================");
		for(int list=cabinetMinister.length-1;list>=0;list--)
		{
			String cabinet=cabinetMinister[list];
			System.out.println("primeminister:"+cabinet);
		}	
		
	}
	
	public static void politicalParties(String[] politicalParties)
	{
		System.out.println("======================");
		System.out.println("running politicalParties in country");
		for(int political=0;political<politicalParties.length;political++)
		{
			String pparties=politicalParties[political];
			System.out.println("politicalParties:"+pparties);
		}
		System.out.println("======================");
		for(int political=politicalParties.length-1;political>=0;political--)
		{
			String pparties=politicalParties[political];
			System.out.println("politicalParties:"+pparties);
		}	
		
	}
	
}