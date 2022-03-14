package com.springboot.web.Service;

import com.springboot.web.details.Details;
import com.springboot.web.inter.ownerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    public Object getDepartment() {
        return this.contactrepo.findAll();
    }
}
