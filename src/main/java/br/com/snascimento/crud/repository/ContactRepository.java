package br.com.snascimento.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.snascimento.crud.model.Contact;

@Repository
public interface ContactRepository 
    extends JpaRepository<Contact, Long> { }
