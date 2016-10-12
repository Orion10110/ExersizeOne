package com.orion10110.training.ExersizeOne.impls;

import java.util.Comparator;

import com.orion10110.training.ExersizeOne.Ex3.Stationery;

public class StationeryNameComparator implements Comparator<Stationery>{
	 public int compare(Stationery a, Stationery b){
	      
	        return a.getName().compareTo(b.getName());
	    }
}
