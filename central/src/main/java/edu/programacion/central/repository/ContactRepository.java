package edu.programacion.central.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.programacion.central.domain.Contact;


@Repository
public interface ContactRepository extends JpaRepository<Contact, Integer>{

}
