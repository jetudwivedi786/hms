package com.springboot.web.service;

import com.springboot.web.model.roomDetails;

import java.util.List;

public interface roomService {
    public List<roomDetails> getAllRooms();

    roomDetails addrooms(roomDetails roomdetails);

    roomDetails updaterooms(roomDetails roomDetails);

    void deleteById(Integer roomnumber);


    Object getbyid(Integer id);

}
