package com.aipalbot.flight.models;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class BusinessPersonnel extends Person  {

private Company company;

public BusinessPersonnel(String name, Address address) {
	super(name, address);
}
}
