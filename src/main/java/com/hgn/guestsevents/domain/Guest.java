package com.hgn.guestsevents.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Guest {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	private Integer age;
	private String cpf;
	
	@ManyToOne
	@JoinColumn(name="event_id")
	private Event event;

	@OneToMany(mappedBy = "guest", cascade = CascadeType.ALL)
	private List<GuestFamily> family;

	public Guest() {
	}

	public Guest(Long id, String name, Integer age, String cpf, Event event, List<GuestFamily> family) {
		this.id = id;
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
