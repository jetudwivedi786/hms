package com.springboot.web.Service;

import com.springboot.web.details.Details;
import com.springboot.web.inter.ownerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ownerServiceImplement implements ownerService{
    @Autowired
    private ownerRepo contactrepo;


    @Override
    public Details addDepartment(Details detail) {
        return this.contactrepo.save(detail);
    }

    @Override
    public Details updateDepartment(Details detail) {
        return this.contactrepo.save(detail);
    }

    @Override
    public void deleteById(Integer id) {
        this.contactrepo.deleteById(id);
    }

    @Override
    public List<Details> getUsers() {
        List<Details> users = contactrepo.findAll();
        System.out.println("Getting data from DB : " + users);
        return users;    }

//    @Override
//    public Object getDepartment() {
//        return this.contactrepo.findAll();
//    }
}
