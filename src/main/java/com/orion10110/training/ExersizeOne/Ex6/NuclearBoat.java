package com.orion10110.training.ExersizeOne.Ex6;

public class NuclearBoat {
	private EngineForNuclearBoat engine =new EngineForNuclearBoat(20);
	private double locationX;
	private double locationY;
	
	
	
	public NuclearBoat(double locationX, double locationY) {
		super();
		this.locationX = locationX;
		this.locationY = locationY;
		
	}

	public void goToXY(double x,double y){
		engine.startEngine();
		double distance = Math.sqrt(Math.pow((locationX-x),2)
				+Math.pow((locationY+y),y));
		engine.spendFuel(distance);
		locationX=x;
		locationY=y;
		engine.stopEngine();
		
	}

	public double getLocationX() {
		return locationX;
	}



	public double getLocationY() {
		return locationY;
	}



	class EngineForNuclearBoat{
		private double nucliarFuel;
		private boolean started=false;
		
		private EngineForNuclearBoat(double nucliarFuel){
			this.nucliarFuel=nucliarFuel;
		}

		public double getNucliarFuel() {
			return nucliarFuel;
		}

		public void setNucliarFuel(double nucliarFuel) {
			this.nucliarFuel = nucliarFuel;
		}

		public boolean isStarted() {
			return started;
		}
		
		public void startEngine(){
			started=true;
			System.out.println("Engine started");
		}
		
		public void stopEngine(){
			started=false;
			System.out.println("Engine stoped");
		}
		
		public void spendFuel(double fuel){
			if(fuel<=nucliarFuel && this.isStarted()){
			nucliarFuel-=fuel;
			}else{
				System.out.println("Bam-bam");
			}
		}
		
	}
}
