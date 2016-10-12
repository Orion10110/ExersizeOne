package com.orion10110.training.ExersizeOne.Starts;

import java.util.ArrayList;

import com.orion10110.training.ExersizeOne.Ex3.Stationery;
import com.orion10110.training.ExersizeOne.Fabric.FabricStationery;

public class StartEx3 {
	public static void main(String[] args){
		ArrayList<Stationery> stationeries = FabricStationery.getBeginerStationery();
		for(Stationery st:stationeries){
			System.out.println(st.getName());
			System.out.println(st.getPrice());
		}
	}
}
