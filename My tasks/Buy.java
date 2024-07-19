class BuyProduct
{
	public static void products(String brand, double price)
	{
		System.out.println("-----------");
		System.out.println("brand is:"+brand);
		System.out.println("price is:"+price);
		
		if(brand=="premium")
		{
			System.out.println("brand can be buy");
		}
		else
		{
			System.out.println("brand can be buy for one time");
		}
		if(price>100 && price<50000)
		{
			System.out.println("price is valid");
		}
		else
		{
			System.out.println("price is costly");
		}
	}
	public static void glossory(String name, int quantity, double price)
	{
		System.out.println("-----------");
		System.out.println("name is:"+name);
		System.out.println("quantity is:"+quantity);
		System.out.println("price is:"+price);
		
		if(name=="rice")
		{
			System.out.println("name is a type of glossory");
		}
		else
		{
			System.out.println("name is not a type of glossory");
		}
		if(quantity>1 && quantity<50)
		{
			System.out.println("quantity is less");
		}
		else
		{
			System.out.println("quantity is more");
		}
		
		if(price>1000 && price<5000)
		{
			System.out.println("price is valid");
		}
		else
		{
			System.out.println("price is costly");
		}
	}
	public static void bookMovieTicket(String name, String theaterName, int quantity, double price)
	{
		System.out.println("-----------");
		System.out.println("name is:"+name);
		System.out.println("theaterName is:"+theaterName);
		System.out.println("quantity is:"+quantity);
		System.out.println("price is:"+price);
		
		if(name=="balcony")
		{
			System.out.println("balcony is the highest class");
		}
		else
		{
			System.out.println("balcony is not available");
		}
		if(theaterName=="prasanna theater")
		{
			System.out.println("theater is near");
		}
		else
		{
			System.out.println("theater is far");
		}
		
		if(quantity>1 && quantity<500)
		{
			System.out.println("quantity is valid");
		}
		else
		{
			System.out.println("quantity is not valid");
		}
		if(price>100 && price<400)
		{
			System.out.println("price is valid");
		}
		else
		{
			System.out.println("price is costly");
		}
		
	}
	public static void buyEgg(int total, double pricePerEgg)
	{
		System.out.println("-----------");
		System.out.println("total is:"+total);
		if(total>200 && total<800)
		{
			System.out.println("egg can buy");
		}
		else
		{
			System.out.println("egg cannot buy");
		}
		System.out.println("pricePerEgg is:"+pricePerEgg);
		if(pricePerEgg==7  && pricePerEgg!=7)
		{
			System.out.println("price is valid");
		}
		else
		{
			System.out.println("price is invalid");
		}
	}
	public static void buyShampoo(int quantityInMl, double price, String brand, String manfDate)
	{
		System.out.println("-----------");
		System.out.println("quantityInMl is:"+quantityInMl);
		if(quantityInMl>5  && quantityInMl<150)
		{
			System.out.println("quantityInMl is valid");
		}
		else
		{
			System.out.println("quantityInMl is invalid");
		}
		System.out.println("price is:"+price);
		if(price>60  && price<678)
		{
			System.out.println("price is valid");
		}
		else
		{
			System.out.println("price is invalid");
		}
		System.out.println("brand is:"+brand);
		if(brand=="firstclass")
		{
			System.out.println("brand can be buy");
		}
		else
		{
			System.out.println("brand can be use for one time");
		}
		
		System.out.println("manfDate is:"+manfDate);
		if(manfDate=="05/2024")
		{
			System.out.println("manfDate is valid");
		}
		else
		{
			System.out.println("manfDate is invalid");
		}
	}
	public static void buyCake(char size, String type, String flavour, double cost, int quantity)
	{
		System.out.println("-----------");
		System.out.println("size is:"+size);
		if(size=='c')
		{
			System.out.println("size is valid");
		}
		else
		{
			System.out.println("size is invalid");
		}
		System.out.println("type is:"+type);
		if(type=="pestery")
		{
			System.out.println("type is valid");
		}
		else
		{
			System.out.println("type is invalid");
		}
		System.out.println("flavour is:"+flavour);
		if(flavour=="chocolate")
		{
			System.out.println("flavour is too tasty");
		}
		else
		{
			System.out.println("flavour is good");
		}
		System.out.println("cost is:"+cost);
		if(cost>200 && cost<4000)
		{
			System.out.println("cost is valid");
		}
		else
		{
			System.out.println("cost is invalid");
		}
		System.out.println("quantity is:"+quantity);
		if(quantity>250 && quantity<4500)
		{
			System.out.println("quantity is valid");
		}
		else
		{
			System.out.println("quantity is invalid");
		}
	}
	public static void buyLaptop(String brand, int serialNo, double price, int batteryCapacity, double screenSize, String os, int hardDiskSize, int ramSize)
	{
		System.out.println("-----------");
		System.out.println("brand is:"+brand);
		if(brand=="lenovo")
		{
			System.out.println("brand is valid");
		}
		else
		{
			System.out.println("brand is invalid");
		}
		System.out.println("serialNo is:"+serialNo);
		if(serialNo>10 && serialNo<5800)
		{
			System.out.println("serialNo is valid");
		}
		else
		{
			System.out.println("serialNo is invalid");
		}
		System.out.println("price is:"+price);
		if(price>25550 && price<65500)
		{
			System.out.println("price is valid");
		}
		else
		{
			System.out.println("price is invalid");
		}
		System.out.println("batteryCapacity is:"+batteryCapacity);
		if(batteryCapacity>567&& batteryCapacity<876)
		{
			System.out.println("batteryCapacity is valid");
		}
		else
		{
			System.out.println("batteryCapacity is invalid");
		}
		System.out.println("screenSize is:"+screenSize);
		if(screenSize>650.54 && screenSize<76574.87)
		{
			System.out.println("screenSize is valid");
		}
		else
		{
			System.out.println("screenSize is invalid");
		}
		System.out.println("os is:"+os);
		if(os=="windows 10")
		{
			System.out.println("os is valid");
		}
		else
		{
			System.out.println("os is invalid");
		}
		System.out.println("hardDiskSize is:"+hardDiskSize);
		if(hardDiskSize>304 && hardDiskSize<796)
		{
			System.out.println("hardDiskSize is valid");
		}
		else
		{
			System.out.println("hardDiskSize is invalid");
		}
		System.out.println("ramSize is:"+ramSize);
		if(ramSize>2 && ramSize<650)
		{
			System.out.println("ramSize is valid");
		}
		else
		{
			System.out.println("ramSize is invalid");
		}
		
	}
	public static void buySmartWatch(String brand, double price, int color, char type, int mode)
	{
		System.out.println("-----------");
		System.out.println("brand is:"+brand);
		if(brand=="apple")
		{
			System.out.println("brand is valid");
		}
		else
		{
			System.out.println("brand is invalid");
		}
		System.out.println("price is:"+price);
		if(price>22000 && price<65000.56)
		{
			System.out.println("price is valid");
		}
		else
		{
			System.out.println("price is invalid");
		}
		System.out.println("color is:"+color);
		if(color>=1 && color<=7)
		{
			System.out.println("color is valid");
		}
		else
		{
			System.out.println("color is invalid");
		}
		System.out.println("type is:"+type);
		if(type=='M')
		{
			System.out.println("type is valid");
		}
		else
		{
			System.out.println("type is invalid");
		}
		System.out.println("mode is:"+mode);
		if(mode>=1 && mode<=3)
		{
			System.out.println("mode is valid");
		}
		else
		{
			System.out.println("mode is invalid");
		}
	}
} 