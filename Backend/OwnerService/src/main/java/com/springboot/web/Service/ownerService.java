package com.springboot.web.Service;

import com.springboot.web.model.Details;

import java.util.List;

public interface ownerService {

    Details updateDepartment(Details detail);


    List<Details> getUsers();


    Details addDepartment(Details detail);


    Object deleteDepartment(Integer id);

//    Object getDepartment();
}
