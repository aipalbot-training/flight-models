package com.aipalbot.flight.models;



import com.aipalbot.flight.utils.Location;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Seat {
private String seatNo;
private String arrangeNo;
private Location location;
private Passenger passenger;
}
