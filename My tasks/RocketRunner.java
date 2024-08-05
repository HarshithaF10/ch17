class RocketRunner
{
public static void main(String[] args)
{
	Rocket rocket=new Rocket(3000);
	rocket.setNoOfThrusters(2.5f);
	rocket.fuelCapacity=150;
	rocket.display();
}
}