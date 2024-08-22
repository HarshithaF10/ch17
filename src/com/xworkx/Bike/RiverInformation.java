package com.xworkx.Bike;

public class RiverInformation {
	private String[] tittle=new String[7];
	private int locate;
	
	public void states(String RiverName)
	{
		this.tittle[this.locate]=RiverName;
		this.locate++;
	}
	public void result()
	{
		for(String RiverName:this.tittle)
			System.out.println("River names are:"+RiverName);
	}

}
