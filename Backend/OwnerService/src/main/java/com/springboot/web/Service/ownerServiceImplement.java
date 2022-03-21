package com.springboot.web.Service;

import com.springboot.web.model.Details;
import com.springboot.web.repository.OwnerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ownerServiceImplement implements ownerService{
    @Autowired
    private OwnerRepo ownerRepo;



    @Override
    public Details updateDepartment(Details detail) {
        return this.ownerRepo.save(detail);
    }


    @Override
    public List<Details> getUsers() {
        List<Details> users = ownerRepo.findAll();
        System.out.println("Getting data from DB : " + users);
        return users;    }



    @Override
    public Details addDepartment(Details detail) {
        return ownerRepo.save(detail);
    }

    @Override
    public Object deleteDepartment(Integer id) {
        this.ownerRepo.deleteById(id);
        return null;
    }


//    @Override
//    public Object getDepartment() {
//        return this.contactrepo.findAll();
//    }
}
