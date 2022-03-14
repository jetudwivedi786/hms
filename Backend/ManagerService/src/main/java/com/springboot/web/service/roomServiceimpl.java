package com.springboot.web.service;

import com.springboot.web.details.roomDetails;
import com.springboot.web.details.staffDetails;
import com.springboot.web.inter.roomRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;
@Service

public class roomServiceimpl implements roomService {
    @Autowired
    private roomRepo roomrepo;
//    @Autowired
//    private roomService roomservice;


    @Override
    public List<roomDetails> getAllRooms() {
        return roomrepo.findAll();
    }

    @Override
    public roomDetails addrooms(roomDetails roomdetails) {
        return roomrepo.save(roomdetails);
    }

    @Override
    public roomDetails updaterooms(roomDetails roomDetails) {
        return roomrepo.save(roomDetails);
    }

    @Override
    public void deleteById(Integer roomnumber) {
        roomrepo.deleteById(roomnumber);
    }

    @Override
    public Object getbyid(Integer id) {
        return roomrepo.findById(id);
    }




}
