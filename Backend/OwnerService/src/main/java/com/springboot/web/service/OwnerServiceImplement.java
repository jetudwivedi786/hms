package com.springboot.web.service;

import com.springboot.web.model.Details;
import com.springboot.web.repository.OwnerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OwnerServiceImplement implements OwnerService {
    @Autowired
    private OwnerRepo ownerRepo;



    @Override
    public Details updateDepartment(Details detail) {
        return this.ownerRepo.save(detail);
    }


    @Override
    public List<Details> getUsers() {
        return ownerRepo.findAll();
    }



    @Override
    public Details addDepartment(Details detail) {
        return ownerRepo.save(detail);
    }

    @Override
    public void deleteDepartment(Integer id) {
        this.ownerRepo.deleteById(id);

    }



}
