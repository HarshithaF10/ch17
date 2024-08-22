package com.xworkx.BikeRunner;

import com.xworkx.Bike.BikeInformation;

public class BikeInfoRunner {

	public static void main(String[] args) {
		BikeInformation bikeInformation=new BikeInformation();
		bikeInformation.save("X-pulse");
		bikeInformation.save("R15");
		bikeInformation.save("Honda");
		bikeInformation.save("Pulsur");
		bikeInformation.save("Splender");
		bikeInformation.save("Hero-Honda");
		bikeInformation.save("Bullet");
		bikeInformation.show();

	}

}
