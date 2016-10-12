package com.orion10110.training.ExersizeOne.Ex3;

public class Pencil extends WriterStationery{
	
	public Pencil(String name,String inkColor,double price){
		super(name,inkColor,price);
	}

	@Override
	public String write(String text) {
		return text + "written in "+this.getInkColor()+" pencil ";
		
	}
	

}
