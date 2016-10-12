package com.orion10110.training.ExersizeOne.Ex3;

import java.util.ArrayList;

import com.orion10110.training.ExersizeOne.Ex1.Note;
import com.orion10110.training.ExersizeOne.interfaces.IPrice;
import com.orion10110.training.ExersizeOne.interfaces.INotes;

public class Paper extends NotesStationery implements IPrice{
	private double height;
	private double width;
	
	
	public Paper(String name,double price, double height, double width) {
		super(name,price);
		this.height = height;
		this.width = width;
	
	}

	public double getHeight() {
		return height;
	}

	public double getWidth() {
		return width;
	}


}
