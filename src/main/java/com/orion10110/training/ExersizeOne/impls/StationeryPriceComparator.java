package com.orion10110.training.ExersizeOne.impls;

import java.util.Comparator;

import com.orion10110.training.ExersizeOne.Ex3.Stationery;

public class StationeryPriceComparator implements Comparator<Stationery> {

	public int compare(Stationery a, Stationery b) {
		if(a.getPrice()>b.getPrice())
			return 1;
		else if(a.getPrice()<b.getPrice())
			return -1;
		else 
			return 0;
	}

}
