package com.orion10110.training.ExersizeOne.Ex3;

public class ColorPaper extends Paper {
	private String color;

	public ColorPaper(Paper paper, String color) {
		super(paper.getName(),paper.getPrice(), paper.getHeight(), paper.getWidth());
		this.color = color;
	}

}
