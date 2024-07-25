class DefaultRunner
{
	public static void main(String[] args)
	{
		Rupee rupee=new Rupee();
		
		int num1=rupee.value;
		boolean num2=rupee.coinOrNote;
		double num3=rupee.weight;
		
		System.out.println("The value of rupee is:"+num1);
		System.out.println("The value of rupee is:"+num3);
		System.out.println("The weight of rupee is:"+num3);
		System.out.println("============================");
		
		AirCondition airCondition=new AirCondition();
		
		int ac1=airCondition.number;
		String ac2=airCondition.color;
		double ac3=airCondition.price;
		
		System.out.println("The number of AirCondition is:"+ac1);
		System.out.println("The color of AirCondition is:"+ac2);
		System.out.println("The price of AirCondition is:"+ac3);
		System.out.println("============================");
		
		Autorikshaw autorikshaw=new Autorikshaw();
		
		int auto1=autorikshaw.yearOfPurchase;
		String auto2=autorikshaw.name;
		double auto3=autorikshaw.cost;
		
		System.out.println("The year of purchase is:"+auto1);
		System.out.println("The name of Autorikshaw is:"+auto2);
		System.out.println("The cost of Autorikshaw is:"+auto3);
		System.out.println("============================");
		
		AutoDriver autoDriver=new AutoDriver();
		
			String driver1=autoDriver.driverName;
			int driver2=autoDriver.age;
			long driver3=autoDriver.phone;
		
		System.out.println("The name of AutoDriver is:"+driver1);
		System.out.println("The age of AutoDriver is:"+driver2);
		System.out.println("The number of AutoDriver is:"+driver3);
		System.out.println("============================");
		
		Rapido rapido=new Rapido();
		
		String rap1=rapido.location;
		String rap2=rapido.time;
		long rap3=rapido.mobile;
		
		System.out.println("The location of Rapido is:"+rap1);
		System.out.println("The time of arrival is:"+rap2);
		System.out.println("The mobile number of Rapido is:"+rap3);
		System.out.println("============================");
		
		CabCompany cabCompany=new CabCompany();
		
			int cab1=cabCompany.ola;
			int cab2=cabCompany.uber;
			int cab3=cabCompany.auto;
			
			System.out.println("The no of ola of CabCompany is:"+cab1);
			System.out.println("The no of uber of CabCompany is:"+cab2);
			System.out.println("The no of auto of CabCompany is:"+cab3);
		System.out.println("============================");
		
		BMTC bmtc=new BMTC();
		
		int bus1=bmtc.busNo;
		String bus2=bmtc.stopName;
		String bus3=bmtc.depov;
		
		System.out.println("The no of bus is:"+bus1);
		System.out.println("The name of stop is:"+bus2);
		System.out.println("The name of depov is:"+bus3);
		System.out.println("============================");
		
		Matrimony matrimony=new Matrimony();
		
			int name1=matrimony.groom;
			int name2=matrimony.bride;
			String name3=matrimony.positions;
			
		System.out.println("The no of groom is:"+name1);
		System.out.println("The no of bride is:"+name2);
		System.out.println("The name of positions is:"+name3);
		System.out.println("============================");
		
		name1=56;
		name2=67;
		name3="BE";
		
		System.out.println("The updated no of groom is:"+name1);
		System.out.println("The updated no of bride is:"+name2);
		System.out.println("The updated name of positions is:"+name3);
		System.out.println("============================");
		
		Application application=new Application();
		
			String app1=application.appName;
			int app2=application.appNo;
			int app3=application.storage;
			
		System.out.println("The name of application is:"+app1);
		System.out.println("The no of application is:"+app2);
		System.out.println("The storage of application is:"+app3);
		System.out.println("============================");
		
		app1="Whatsapp";
		app2=43265;
		app3=4374;
			
			System.out.println("The updated name of application is:"+app1);
			System.out.println("The updated no of application is:"+app2);
			System.out.println("The updated no of application is:"+app3);
		System.out.println("============================");
		
		Fruit fruit=new Fruit();
		
		String fruit1=fruit.fruitName;
		int apple=fruit.quantity;
		double orange=fruit.amount;
		
		System.out.println("The name of fruit is:"+fruit1);
		System.out.println("The quantity of apple is:"+apple);
		System.out.println("The amount of orange is:"+orange);
		System.out.println("============================");
		
		fruit1="Banana";
		apple=345;
		orange=567567;
		
		System.out.println("The updated name of fruit is:"+fruit1);
			System.out.println("The updated quantity of fruit is:"+apple);
			System.out.println("The updated amount of fruit is:"+orange);
		System.out.println("============================");
		
		Juice juice=new Juice();
		
		String juice1=juice.juiceName;
	String juice2=juice.flavour;
	int juice3=juice.total;
	
		System.out.println("The name of juice is:"+juice1);
		System.out.println("The flavour of juice is:"+juice2);
		System.out.println("The total quantity of juice is:"+juice3);
		System.out.println("============================");
		
		juice1="Mango";
		juice2="cold";
		juice3=4658;
		
		System.out.println("The updated name of juice is:"+juice1);
			System.out.println("The updated flavour of juice is:"+juice2);
			System.out.println("The updated total quantity of juice is:"+juice3);
		System.out.println("============================");
		
		AlcoholBrand alcoholBrand=new AlcoholBrand();
		
		String brand1=alcoholBrand.alcoholName;
	String brand2=alcoholBrand.type;
	int brand3=alcoholBrand.totalQuantity;
	
		System.out.println("The name of alcoholBrand is:"+brand1);
		System.out.println("The type of alcoholBrand is:"+brand2);
		System.out.println("The total quantity of alcoholBrand is:"+brand3);
		System.out.println("============================");
		
		brand1="Black & White";
		brand2="90ml";
		brand3=465;
		
		System.out.println("The updated name of alcoholBrand is:"+brand1);
			System.out.println("The updated type of alcoholBrand is:"+brand2);
			System.out.println("The updated total quantity of alcoholBrand is:"+brand3);
		System.out.println("============================");
		
		Medicine medicine=new Medicine();
		
		String med=medicine.medicineName;
	String medi=medicine.expDate;
	String medici=medicine.manfDate;
		
		System.out.println("The name of Medicine is:"+med);
		System.out.println("The expDate of Medicine is:"+medi);
		System.out.println("The manfDateof Medicine is:"+medici);
		System.out.println("============================");
		
		med="citrizen";
		medi="03/06/2025";
		medici="03/06/2024";
		
		System.out.println("The updated name of Medicine is:"+med);
			System.out.println("The updated expDate of Medicine is:"+medi);
			System.out.println("The updated manfDate of Medicine is:"+medici);
		System.out.println("============================");
		
		Food food=new Food();
		
		food.foodName="Dosa";
		food.itemNo=456;
		food.parcelNo=4;
		
		System.out.println("The updated name of food is:"+food.foodName);
			System.out.println("The updated itemNo of food is:"+food.itemNo);
			System.out.println("The updated parcelNo of food is:"+food.parcelNo);
		
				
	}
}