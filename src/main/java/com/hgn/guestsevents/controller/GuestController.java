package com.hgn.guestsevents.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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

	@RequestMapping(value = "/{guests}", method = RequestMethod.GET)
	public List<Guest> findAll() {
		List<Guest> guests = guestRepository.findAll();
		return guests;
	}

}
