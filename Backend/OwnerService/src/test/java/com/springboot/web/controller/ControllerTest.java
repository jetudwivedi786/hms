package com.springboot.web.controller;

import com.springboot.web.service.OwnerServiceImplement;
import com.springboot.web.model.Details;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.*;
import static org.junit.Assert.assertEquals;


@TestMethodOrder(OrderAnnotation.class)
@SpringBootTest(classes = { ControllerTest.class })
class ControllerTest {
    @InjectMocks
    private Controller controller;
    @Mock
    private OwnerServiceImplement ownerServiceImplement;
    @Mock
    private RestTemplate restTemplate;
    @Test
    void addDepartment() {
        Details det= new Details();
        when(ownerServiceImplement.addDepartment(det)).thenReturn(det);
        assertEquals(det,controller.addDepartment(det));
    }

    @Test
    void updateDepartment() {
        Details det= new Details();
        when(ownerServiceImplement.updateDepartment(det)).thenReturn(det);
        assertEquals(det,controller.updateDepartment(det).getBody());
    }

    @Test
    void deleteDepartment() {
        Details det= new Details();
        det.setId(3);
        controller.deleteDepartment(3);
        verify(ownerServiceImplement,times(1)).deleteDepartment(3);



    }

    @Test
    void findAllUsers() {
        List <Details> detail=new ArrayList<>();
        when(ownerServiceImplement.getUsers()).thenReturn(detail);
        assertEquals(detail.size(), controller.findAllUsers().size());



    }

}