package com.hgn.guestsevents.controller;

import com.hgn.guestsevents.domain.Guest;
import com.hgn.guestsevents.repositories.GuestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/guests")
public class GuestController {

	@Autowired
	private GuestRepository guestRepository;

	@RequestMapping(method = RequestMethod.GET)
	public List<Guest> findAll() {
		return  guestRepository.findAll();
	}

	@RequestMapping(path = "/{id}", method = RequestMethod.GET)
	public Guest findGuestById(@PathVariable Long id) {
				return guestRepository.findById(id);
	}

	@RequestMapping(path = "guest/{cpf}", method = RequestMethod.GET)
	public Guest findGuestByCpf(@PathVariable String cpf) {
		return guestRepository.findByCpf(cpf);
	}

}
