package com.orion10110.training.ExersizeOne.Starts;

import com.orion10110.training.ExersizeOne.Ex2.Employee;
import com.orion10110.training.ExersizeOne.Ex2.Stationery;

public class StartEx2 {
	public static void main(String[] args){
		Employee empl= new Employee("Vsilyi Ivanov");
		empl.addStationery(new Stationery("pencil", 10.05));
		empl.addStationery(new Stationery("pencil", 4));
		empl.addStationery(new Stationery("pencil", 3));
		System.out.println(empl.getCostStationeries());
	}
}
