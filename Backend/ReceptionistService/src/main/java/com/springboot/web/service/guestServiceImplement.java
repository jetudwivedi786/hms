package com.springboot.web.service;

import com.springboot.web.model.Details;
import com.springboot.web.repository.contactRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class guestServiceImplement implements guestService{
    @Autowired
    private contactRepo contactrepo;

    @Override
    public List<Details> getAllGuest() {
        return this.contactrepo.findAll();
    }

    @Override
    public Details updateGuest(Details details) {
        return this.contactrepo.save(details);
    }

    @Override
    public void deleteById(Integer id) {
        this.contactrepo.deleteById(id);
    }

    @Override
    public Details save(Details detail) {
        return this.contactrepo.save(detail);
    }

    @Override
    public Object getById(Details id) {
        return contactrepo.save(id);
    }
}
