package com.hgn.guestsevents.repositories;

import com.hgn.guestsevents.domain.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends JpaRepository<Event, String> {

    Event findById(Long id);


}
