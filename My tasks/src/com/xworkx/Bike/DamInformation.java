package com.xworkx.Bike;

public class DamInformation {
	private String[] title=new String[7];
	private int quantity;
	
	public void visit(String DamName)
	{
		this.title[this.quantity]=DamName;
		this.quantity++;
	}
	public void outcome()
	{
		for(String DamName:this.title)
			System.out.println("Dam names are:"+DamName);
	}

}
