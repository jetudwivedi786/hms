package com.springboot.web.service;

import com.springboot.web.model.Details;

import java.util.List;

public interface OwnerService {

    Details updateDepartment(Details detail);


    List<Details> getUsers();


    Details addDepartment(Details detail);


    void deleteDepartment(Integer id);

}
