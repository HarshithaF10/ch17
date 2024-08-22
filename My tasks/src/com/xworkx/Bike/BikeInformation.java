package com.xworkx.Bike;

public class BikeInformation {
	private String[] names=new String[7];
	private int position;
	
	public void save(String name)
	{
		this.names[this.position]=name;
		this.position++;
	}
	public void show()
	{
		for(String name:this.names)
			System.out.println("Name:"+name);
	}

}
