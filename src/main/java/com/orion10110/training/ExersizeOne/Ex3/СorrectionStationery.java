package com.orion10110.training.ExersizeOne.Ex3;

import com.orion10110.training.ExersizeOne.interfaces.IPrice;

public abstract class СorrectionStationery extends Stationery{
	
	
	protected СorrectionStationery(String name, double price) {
		super(name, price);
	}

	public abstract void correct();

}
