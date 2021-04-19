package com.hgn.guestsevents.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hgn.guestsevents.domain.Guest;

@Repository
public interface GuestRepository extends JpaRepository<Guest, String>{

    Guest findById(Long id);

    Guest findByCpf(String cpf);
}
