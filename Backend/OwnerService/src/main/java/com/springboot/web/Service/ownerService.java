package com.springboot.web.Service;

import com.springboot.web.details.Details;

import java.util.List;

public interface ownerService {

    Details updateDepartment(Details detail);


    List<Details> getUsers();


    Details addDepartment(Details detail);


    void deleteDepartment(Integer id);

//    Object getDepartment();
}
