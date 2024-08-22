package com.xworkx.Bike;

public class sweetInformation {
	private String[] types=new String[7];
	private int value;
	
	public void boxes(String type)
	{
		this.types[this.value]=type;
		this.value++;
	}
	public void display()
	{
		for(String type:this.types)
			System.out.println("Name:"+type);
	}

}
