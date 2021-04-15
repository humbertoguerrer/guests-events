package com.hgn.guestsevents.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hgn.guestsevents.domain.GuestFamily;

@Repository
public interface GuestFamilyRepository extends JpaRepository<GuestFamily, String> {

}
