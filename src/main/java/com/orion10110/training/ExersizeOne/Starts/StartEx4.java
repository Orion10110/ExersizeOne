package com.orion10110.training.ExersizeOne.Starts;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;

import com.orion10110.training.ExersizeOne.Ex3.Stationery;
import com.orion10110.training.ExersizeOne.Fabric.FabricStationery;
import com.orion10110.training.ExersizeOne.impls.StationeryNameComparator;
import com.orion10110.training.ExersizeOne.impls.StationeryPriceComparator;

public class StartEx4 {
	public static void main(String[] args){
		StationeryNameComparator comp1 = new StationeryNameComparator();
		StationeryPriceComparator comp2 = new StationeryPriceComparator();
		Comparator<Stationery> comp3 = new StationeryNameComparator().
				thenComparing(new StationeryPriceComparator());
		TreeSet<Stationery> stationeries = new TreeSet<Stationery>(comp1);
		stationeries.addAll(FabricStationery.getBeginerStationery());
		for(Stationery st:stationeries){
			System.out.println(st.getName());
			System.out.println(st.getPrice());
		}
		System.out.println("----------------");
		stationeries  = new TreeSet<Stationery>(comp2);
		stationeries.addAll(FabricStationery.getBeginerStationery());
		for(Stationery st:stationeries){
			System.out.println(st.getName());
			System.out.println(st.getPrice());
		}
		System.out.println("----------------");
		stationeries  = new TreeSet<Stationery>(comp3);
		stationeries.addAll(FabricStationery.getBeginerStationery());
		for(Stationery st:stationeries){
			System.out.println(st.getName());
			System.out.println(st.getPrice());
		}
		
	}
}
