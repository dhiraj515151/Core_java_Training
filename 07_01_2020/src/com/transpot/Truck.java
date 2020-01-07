package com.transpot;
public class Truck extends Transport {
	
	@Override
	double calculateDistance(double initialdistance, double finaldistance) {
		// TODO Auto-generated method stub]
	    setDistance(finaldistance-initialdistance);	
		return getDistance();
	}

	@Override
	double calculateEfficiency(double initialfuel, double finalfuel) {
		// TODO Auto-generated method stub
		setEfficiency(getDistance()/(initialfuel-finalfuel));
		return getDistance();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Truck's "+super.toString();
	}
	
 
}