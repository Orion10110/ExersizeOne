package com.orion10110.training.ExersizeOne.Ex2;

import java.util.ArrayList;
import java.util.Collection;

public class Employee {
	private ArrayList<Stationery> stationeries = new ArrayList<Stationery>();
	private String name;
	
	public Employee(String name){
		this.name = name;
	}
	
	public Employee(String name,Collection<Stationery> stationeries){
		this(name);
		this.stationeries.addAll(stationeries);
	}
	
	public void addStationery(Stationery stationery){
		this.stationeries.add(stationery);
	}
	
	public void addAllStationery(Collection<Stationery> stationeries){
		this.stationeries.addAll(stationeries);
	}
	
	public void removeStationery(Stationery stationery){
		this.stationeries.remove(stationery);
	}
	
	public void removeStationery(int index){
		try{
			this.stationeries.remove(index);
		}catch(IndexOutOfBoundsException e){
			System.out.println("Station is not deleted, the index is out of range");
		}
	}
	
	public void updateStationery(int index,Stationery stationery){
		try{
			Stationery st = this.stationeries.get(index);
			st.setName(stationery.getName());
			st.setPrice(stationery.getPrice());
		}catch(IndexOutOfBoundsException e){
			System.out.println("Station is not updated, the index is out of range");
		}
	}
	
	public double getCostStationeries(){
		double cost=0;
		for(Stationery st:stationeries){
			cost+=st.getPrice();
		}
		return cost;
	}
}
