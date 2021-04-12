package com.hgn.guestsevents.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Event {

	private String name;
	private Date date;
	private String location;

	private List<Guest> guests = new ArrayList<>();

	public Event() {
	}

	public Event(String name, Date date, String location, List<Guest> guests) {
		this.name = name;
		this.date = date;
		this.location = location;
		this.guests = guests;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public List<Guest> getGuests() {
		return guests;
	}

	public void setGuests(List<Guest> guests) {
		this.guests = guests;
	}

}
