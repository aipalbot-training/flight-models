package com.aipalbot.flight.models;


import com.aipalbot.flight.utils.State;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Address {
	public String street;
	public String city;
	public int zipCode;
	public State state;	
}
