package com.springboot.web.service;

import com.springboot.web.model.roomDetails;
import com.springboot.web.repository.roomRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class roomServiceimpl implements roomService {
    @Autowired
    private roomRepo roomrepo;
//    @Autowired
//    private roomService roomservice;


//    @Override
//    public List<roomDetails> getAllRooms() {
//        return roomrepo.findAll();
//    }

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

    @Override
    public List<roomDetails> getAlRooms() {
        List<roomDetails> users = roomrepo.findAll();
        System.out.println("Getting data from DB : " + users);
        return users;    }
    }



