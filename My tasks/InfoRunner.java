class InfoRunner
{
	public static void main(String[] args)
	{
	if(args.length==4)
	{
		String name=args[0];
		String manfDate=args[1];
		String price=args[2];
		String quantity=args[3];
	
	int convertedDate=Integer.parseInt(manfDate);
	float convertedPrice=Float.parseFloat(price);
	int convertedQuantity=Integer.parseInt(quantity);
	MedicineInfo.info(name,convertedDate,convertedPrice,convertedQuantity);
	}
	}
}