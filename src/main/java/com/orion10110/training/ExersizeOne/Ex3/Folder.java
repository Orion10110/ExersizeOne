package com.orion10110.training.ExersizeOne.Ex3;

import java.util.ArrayList;

import com.orion10110.training.ExersizeOne.interfaces.IPrice;

public class Folder<T extends File> extends Stationery {
	private String color;
	private ArrayList<T> files = new ArrayList<T>();

	public Folder(String name, String color, double price) {
		super(name, price);
		this.color = color;
	}

	public void addFile(T file) {
		files.add(file);
	}

	public T takeFile(int index) {
		return files.remove(index);
	}

	public String getColor() {
		return color;
	}

}
