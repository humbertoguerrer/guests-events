package com.hgn.guestsevents.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Entity
public class Event implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String name;
  private Date date;
  private String location;


  @JsonIgnore
  @ManyToMany(cascade = CascadeType.PERSIST)
  @JoinTable(
          name = "event_guests",
          joinColumns = @JoinColumn(name = "id_event"),
          inverseJoinColumns = @JoinColumn(name = "id_guest"))
  private List<Guest> guests;

  public Event() {}

  public Event(Long id, String name, Date date, String location, List<Guest> guests) {
    this.id = id;
    this.name = name;
    this.date = date;
    this.location = location;
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
