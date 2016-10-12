package com.orion10110.training.ExersizeOne.Ex3;

import com.orion10110.training.ExersizeOne.interfaces.IPrice;

public class Sticker extends ColorPaper {
	public Sticker(Paper paper, String color) {
		super(paper, color);
		// TODO Auto-generated constructor stub
	}
	
	public void attachSticker(){
		System.out.println("Sticker attached");
	}

}
