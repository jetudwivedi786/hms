package com.springboot.web.service;

import com.springboot.web.model.Details;
import com.springboot.web.repository.OwnerRepo;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@SpringBootTest
class OwnerServiceImplementTest {
    @InjectMocks
    private OwnerServiceImplement ownerservice;
    @Mock
    private OwnerRepo ownerRepo;

    @Test
    void updateDepartment() {
        Details updateDetails =  new Details(23,"manager",12
        );
        ownerservice.updateDepartment(updateDetails);
        verify(ownerRepo,times(1)).save(updateDetails);
    }

    @Test
    void getUsers() {
        when(ownerRepo.findAll()).thenReturn(Stream.of(new Details(23,"jkhjkh",12)).collect(Collectors.toList()));
        assertEquals(1,ownerservice.getUsers().size());
    }

    @Test
    void addDepartment() {
        Details det=new Details(2,"jeetu",23);
        when(ownerRepo.save(det)).thenReturn(det);
        assertEquals(det,ownerservice.addDepartment(det));
    }

    @Test
    void deleteDepartment() {
        Integer userID = 23;
        ownerservice.deleteDepartment(userID);
        verify(ownerRepo,times(1)).deleteById(userID);
    }




}