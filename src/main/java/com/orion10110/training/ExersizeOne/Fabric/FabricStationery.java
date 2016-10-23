package com.orion10110.training.ExersizeOne.Fabric;

import java.util.ArrayList;

import com.orion10110.training.ExersizeOne.Ex3.Eraser;
import com.orion10110.training.ExersizeOne.Ex3.File;
import com.orion10110.training.ExersizeOne.Ex3.Marker;
import com.orion10110.training.ExersizeOne.Ex3.Paper;
import com.orion10110.training.ExersizeOne.Ex3.Pen;
import com.orion10110.training.ExersizeOne.Ex3.Stationery;

public class FabricStationery {
	public static ArrayList<Stationery> getBeginerStationery(){
		ArrayList<Stationery> stationeries = new ArrayList<Stationery>();
			stationeries.add(new Pen("MyPen","Black", 9.99));
			stationeries.add(new Pen("BluePen","Blue",5.99));
			stationeries.add(new Paper("A4",1,298,184));
			stationeries.add(new Paper("A4",1,298,184));
			stationeries.add(new Paper("A4",1,298,184));
			stationeries.add(new Eraser("Eraser",2));
			stationeries.add(new Marker("Mar04",0.4,"Green",5));
			File fs =new File("File1","Mate",1);
			fs.addPaper(new Paper("A3",1,150,100));
			stationeries.add(fs);
		return stationeries;
	}
	
}
