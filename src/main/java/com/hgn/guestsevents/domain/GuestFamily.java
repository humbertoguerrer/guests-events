package com.hgn.guestsevents.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class GuestFamily implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String name;
  private Integer age;
  private String kinship;

  @JsonIgnore
  @ManyToOne(cascade = CascadeType.PERSIST)
  @JoinColumn(name = "guest_id")
  private Guest guest;

  public GuestFamily() {}

  public GuestFamily(Long id, String name, Integer age, String kinship, Guest guest) {
    this.id = id;
    this.name = name;
    this.age = age;
    this.kinship = kinship;
    this.guest = guest;
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

  public String getKinship() {
    return kinship;
  }

  public void setKinship(String kinship) {
    this.kinship = kinship;
  }

  public Guest getGuest() {
    return guest;
  }

  public void setGuest(Guest guest) {
    this.guest = guest;
  }
}
