package com.orion10110.training.ExersizeOne.Ex3;

import java.util.ArrayList;

import com.orion10110.training.ExersizeOne.interfaces.IPrice;

public class File<T extends Paper> extends Stationery{
	private String type;	
	private ArrayList<T> papers = new ArrayList<T>();
	
	
	public File(String name,String type, double price) {
		super(name,price);
		this.type = type;
	}

	public void addPaper(T paper){
		papers.add(paper);
	}
	
	public T takePaper(int index){
			return papers.remove(index);
	}

	public String getType() {
		return type;
	}
	
	
}
