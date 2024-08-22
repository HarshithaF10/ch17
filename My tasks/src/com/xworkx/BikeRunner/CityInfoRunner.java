package com.xworkx.BikeRunner;

import com.xworkx.Bike.CityInformation;

public class CityInfoRunner {
	public static void main(String[] args) {
	
		CityInformation cityInformation=new CityInformation();
		cityInformation.blocks(6);
		cityInformation.blocks(4);
		cityInformation.blocks(9);
		cityInformation.blocks(2);
		cityInformation.blocks(8);
		cityInformation.blocks(2);
		cityInformation.blocks(10);
		cityInformation.print();
	}

}
