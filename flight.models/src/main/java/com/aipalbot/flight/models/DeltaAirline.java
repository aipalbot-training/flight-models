package com.aipalbot.flight.models;

import lombok.Getter;

@Getter
public class DeltaAirline extends Flight {
	
	private double discount;
	
	public DeltaAirline(double d) {
		discount=d;
	}
	
}
