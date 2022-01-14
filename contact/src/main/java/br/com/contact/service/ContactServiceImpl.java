package br.com.contact.service;


import br.com.contact.model.Contact;
import br.com.contact.model.RequestDTO;
import br.com.contact.model.ResponseDTO;
import br.com.contact.repository.ContactRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactServiceImpl implements ContactService {

    @Autowired
    private ContactRepository contactRepository;
  

    @Override
    public void createContact(RequestDTO request) {
        this.contactRepository.save(new Contact().convertToEntity(request));
    }

    @Override
    public void removeContact(Long id) {
        this.contactRepository.deleteById(id);
    }

    @Override
    public RequestDTO getContactByName(String name) {
        return null;
    }

    @Override
    public void updateContact(Long id, RequestDTO request) {
        Contact contactUpdate = contactRepository.findById(id).get();
        BeanUtils.copyProperties(request, contactUpdate, "id");
        contactRepository.save(contactUpdate);
    }

    @Override
    public List<ResponseDTO> getAllContacts() {
        return this.contactRepository.findAll()
                .stream().map(contact -> contact.convertToResponse(contact))
                .collect(Collectors.toList());
    }

    @Override
    public void updateContact(RequestDTO request) {

    }

    @Override
    public ResponseDTO getByName(String name) {
        return this.contactRepository.findByName(name);
    }


}
