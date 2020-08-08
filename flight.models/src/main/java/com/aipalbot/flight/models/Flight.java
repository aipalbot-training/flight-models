package com.aipalbot.flight.models;

import java.util.List;
import java.util.Map;

import com.aipalbot.flight.utils.AirportCode;
import com.aipalbot.flight.utils.Color;
import com.aipalbot.flight.utils.Deal;
import com.aipalbot.flight.utils.FlightSize;
import com.aipalbot.flight.utils.Terminal;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Flight {

	private Color color;
	private String lift;
	private String thrust;
	private String drag;
	private String flightNo;
	private int weight;
	private Map<String,Seat> seats;
	private List<Person> attendants;
	private Terminal terminal;
	private AirportCode arrival; //arrival
	private AirportCode departure; //departure
	private Deal deal;
	private FlightSize size;
	
	
}
