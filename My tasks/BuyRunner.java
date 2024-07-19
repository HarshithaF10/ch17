class BuyRunner
{
	public static void main(String[] Buy)
	{
		System.out.println("running main in BuyRunner");
		BuyProduct.products("premium",362.675);
		BuyProduct.products("firstclass",378657.35);
		
		BuyProduct.glossory("rice",6,865.67);
		BuyProduct.glossory("wheat",65,453.977);
		
		BuyProduct.bookMovieTicket("balcony","prasanna theater",5,150);
		BuyProduct.bookMovieTicket("firstclass","veera theater",100,1000);
		
		BuyProduct.buyEgg(567,6);
		BuyProduct.buyEgg(5687,96.675);
		
		BuyProduct.buyShampoo(5,674.45,"firstclass","06/2024" );
		BuyProduct.buyShampoo(300,5775,"secondclass","05/2024" );
		
		BuyProduct.buyCake('v',"pestery","chocolate",268,4765);
		BuyProduct.buyCake('c',"normal","mango",168,45765);
		
		BuyProduct.buyLaptop("lenovo",54774,654,2764,62437.36,"windows 10",254, 5);
		BuyProduct.buyLaptop("dell",657,6554,9876,54.36,"windows 11",6768, 1);
		
		BuyProduct.buySmartWatch("apple",21000.3,5,'M',6);
		BuyProduct.buySmartWatch("boat",55000.3,8,'k',2);
	}
}