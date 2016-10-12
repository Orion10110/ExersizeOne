package com.orion10110.training.ExersizeOne.Ex3;

import com.orion10110.training.ExersizeOne.interfaces.IAwareName;
import com.orion10110.training.ExersizeOne.interfaces.IPrice;

public abstract class Stationery implements IPrice,IAwareName {
	private double price;
	private String name;
	
	protected Stationery(String name,double price){
		this.name=name;
		this.price=price;
	}
	
	public void setPrice(double price){
		this.price=price;
	}
	
	public double getPrice(){
		return price;
	}
	
	public String getName(){
		return name;
	}
}
