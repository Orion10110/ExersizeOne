package com.orion10110.training.ExersizeOne.Ex3;

import com.orion10110.training.ExersizeOne.interfaces.IPrice;

public abstract class WriterStationery extends Stationery{
	private String inkColor;
	
	protected WriterStationery(String name,String inkColor,double price) {
		super(name,price);
		this.inkColor = inkColor;
	}
	
	
	public abstract String write(String text);

	public String getInkColor() {
		return inkColor;
	}
	
	

	
}
