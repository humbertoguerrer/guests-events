package com.hgn.guestsevents.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hgn.guestsevents.domain.Event;

@Repository
public interface EventRepository extends JpaRepository<Event, String> {

}
