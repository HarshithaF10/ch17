package com.xworkx.BikeRunner;

import com.xworkx.Bike.DamInformation;

public class DamInfoRunner {

	public static void main(String[] args) {
		DamInformation damInformation=new DamInformation();
		damInformation.visit("KRS");
		damInformation.visit("Markonalli");
		damInformation.visit("Savandurga");
		damInformation.visit("Hemavathi");
		damInformation.visit("Almatti");
		damInformation.visit("Supa");
		damInformation.visit("vani vilasa sagara");
		damInformation.outcome();

	}

}
