package com.xworkx.Bike;

public class CityInformation {
	private int[] area=new int[7];
	private int place;
	
	public void blocks(int areaNames)
	{
		this.area[this.place]=areaNames;
		this.place++;
	}
	public void print()
	{
		for(int areaNames:this.area)
			System.out.println("No of areas are:"+areaNames);
	}

}
