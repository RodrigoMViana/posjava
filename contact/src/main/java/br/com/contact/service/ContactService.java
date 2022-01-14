package br.com.contact.service;

import java.util.List;

import br.com.contact.model.RequestDTO;
import br.com.contact.model.ResponseDTO;

public interface ContactService {
    public void createContact(RequestDTO request);
    public void removeContact(Long id);
    public RequestDTO getContactByName(String name);
    public ResponseDTO getByName(String name);
    void updateContact(Long id, RequestDTO request);
    public List<ResponseDTO> getAllContacts();
    public void updateContact(RequestDTO request);


}
