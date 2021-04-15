package com.hgn.guestsevents;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.hgn.guestsevents.domain.Event;
import com.hgn.guestsevents.domain.Guest;
import com.hgn.guestsevents.domain.GuestFamily;
import com.hgn.guestsevents.repositories.EventRepository;
import com.hgn.guestsevents.repositories.GuestFamilyRepository;
import com.hgn.guestsevents.repositories.GuestRepository;

@SpringBootApplication
public class GuestsEventsApplication implements CommandLineRunner {

	@Autowired
	private GuestRepository guestRepository;

	@Autowired
	private EventRepository eventRepository;

	@Autowired
	private GuestFamilyRepository guestFamilyRepository;

	public static void main(String[] args) throws ParseException {
		SpringApplication.run(GuestsEventsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Date data = sdf.parse("27/02/2022");
		Date data2 = sdf.parse("09/02/2023");

		Event casamBruno = new Event(null, "Casamento Bruno", data, "Rua das Goiabeiras");

		Event niverGu = new Event(null, "Aniversário Gustavo", data2, "Rua das Laranjeiras");

		List<GuestFamily> famHumberto = new ArrayList<>();
		famHumberto.add(new GuestFamily(null, "jaiza", 68, "mother"));
		famHumberto.add(new GuestFamily(null, "alcides", 72, "father"));
		famHumberto.add(new GuestFamily(null, "leticia", 37, "sister"));

		Guest humberto = new Guest(null, "humberto", 33, "123345678", casamBruno, famHumberto);

		List<GuestFamily> famAna = new ArrayList<>();
		famAna.add(new GuestFamily(null, "fatima", 68, "mother"));
		famAna.add(new GuestFamily(null, "felipe", 25, "brother"));

		Guest ana = new Guest(null, "ana", 35, "098676554", niverGu, famAna);

		List<Guest> guestsCasamBruno = new ArrayList<>();
		guestsCasamBruno.add(humberto);
		guestsCasamBruno.add(ana);

		List<Guest> guestsNiverGU = new ArrayList<>();
		guestsNiverGU.add(ana);

		casamBruno.setGuests(guestsCasamBruno);

		eventRepository.save(casamBruno);
		eventRepository.save(niverGu);

		guestFamilyRepository.saveAll(famHumberto);
		guestRepository.save(humberto);

		guestFamilyRepository.saveAll(famAna);
		guestRepository.save(ana);

	}

}
