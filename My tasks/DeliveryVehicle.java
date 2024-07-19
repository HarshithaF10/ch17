class DeliveryVehicle
{
public static void deliver(String item, String location)
{
System.out.println("running deliver in DeliveryVehicle class");
System.out.println("**********");
Company.deliver(item,location);
}
}