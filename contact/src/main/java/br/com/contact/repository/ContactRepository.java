package br.com.contact.repository;

import br.com.contact.model.Contact;
import br.com.contact.model.ResponseDTO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //interface managed by spring
public interface ContactRepository extends JpaRepository<Contact, Long> {
    public ResponseDTO findByName(String name);
}
