package com.hgn.guestsevents.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

@Entity
public class Guest implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String name;
  private Integer age;
  private String cpf;

  @ManyToMany(mappedBy = "guests")
  private List<Event> event;

  @OneToMany(mappedBy = "guest", cascade = CascadeType.ALL)
  private List<GuestFamily> family;

  public Guest() {}

  public Guest(Long id, String name, Integer age, String cpf, List<Event> events, List<GuestFamily> family) {
    this.id = id;
    this.name = name;
    this.age = age;
    this.cpf = cpf;
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

  public List<Event> getEvents() {
    return event;
  }

  public void setEvent(List<Event> event) {
    this.event = event;
  }

  public List<GuestFamily> getFamily() {
    return family;
  }

  public void setFamily(List<GuestFamily> family) {
    this.family = family;
  }
}
