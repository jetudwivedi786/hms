package com.springboot.web.service;

import com.springboot.web.exception.ItemException;
import com.springboot.web.model.Details;
import com.springboot.web.repository.GuestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuestServiceImplement implements GuestService {
    @Autowired
    private GuestRepository contactrepo;

    @Override
    public List<Details> getAllGuest() {
        return this.contactrepo.findAll();
    }


    @Override
    public String deleteById(Integer id) {
        boolean isGuestExist=contactrepo.existsById(id);
        if(isGuestExist){
            contactrepo.deleteById(id);
            return ("delete guest with id :"+ id);

        }
        else {
            throw new ItemException("102","can not delete id: "+id);
        }
//        this.contactrepo.deleteById(id);
    }

    @Override
    public Details save(Details detail) {
        return this.contactrepo.save(detail);
    }

    @Override
    public Object getById(Details id) {
        return contactrepo.save(id);
    }

    @Override
    public List<Details> getAlGuest() {
        return this.contactrepo.findAll();
    }

    @Override
    public Details updateGuest(Details detail) {
        return this.contactrepo.save(detail);
    }
}
