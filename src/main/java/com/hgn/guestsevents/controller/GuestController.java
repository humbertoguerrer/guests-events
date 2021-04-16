package com.hgn.guestsevents.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hgn.guestsevents.domain.Guest;
import com.hgn.guestsevents.repositories.GuestRepository;

@RestController
@RequestMapping(value = "/guests")
public class GuestController {

	@Autowired
	private GuestRepository guestRepository;

	@RequestMapping(method = RequestMethod.GET)
	public List<Guest> findAll() {
		return  guestRepository.findAll();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Guest findGuest(@PathVariable Long id) {
		return guestRepository.findById(id);
	}

}
