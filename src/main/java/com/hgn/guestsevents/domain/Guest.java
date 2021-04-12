package com.hgn.guestsevents.domain;

import java.util.ArrayList;
import java.util.List;

public class Guest {

	private Long id;
	private String name;
	private Integer age;
	private String cpf;
	private Event event;

	private List<GuestFamily> family = new ArrayList<>();

	public Guest() {
	}

	public Guest(String name, Integer age, String cpf, Event event, List<GuestFamily> family) {
		this.name = name;
		this.age = age;
		this.cpf = cpf;
		this.event = event;
		this.family = family;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Event getEvent() {
		return event;
	}

	public void setEvent(Event event) {
		this.event = event;
	}

	public List<GuestFamily> getFamily() {
		return family;
	}

	public void setFamily(List<GuestFamily> family) {
		this.family = family;
	}

}