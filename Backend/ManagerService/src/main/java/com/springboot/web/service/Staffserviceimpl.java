package com.springboot.web.service;

import com.springboot.web.model.staffDetails;
import com.springboot.web.repository.StaffRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Staffserviceimpl implements staffService{
    @Autowired
    private StaffRepo repo;


    @Override
    public Object getAllstaff() {
        return this.repo.findAll();
    }

    @Override
    public Object findById(Integer id) {
        return this.repo.findById(id);
    }

    @Override
    public staffDetails addStaff(staffDetails detail) {
        return this.repo.save(detail);
    }

    @Override
    public staffDetails updateStaff(staffDetails detail) {
        return this.repo.save(detail);
    }

    @Override
    public void deleteById(Integer id) {
        this.repo.deleteById(id);
    }


}
