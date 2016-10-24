package com.orion10110.training.ExersizeOne.Ex3;

public class Eraser extends СorrectionStationery {

	public Eraser(String name, double price) {
		super(name, price);
	}

	@Override
	public void correct() {
		System.out.println("Wipe of pencil.");
	}

}
