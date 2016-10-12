package com.orion10110.training.ExersizeOne.Ex3;

public class Мarker extends WriterStationery {

	private double penSize;

	public Мarker(String name,double penSize, String inkColor, double price) {
		super(name,inkColor,price);
		this.penSize = penSize;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String write(String text) {
		return text + "written in " + this.getInkColor() + " " + this.getPenSize() + " marker ";

	}

	public double getPenSize() {
		return penSize;
	}

}
