package com.springboot.web.Service;

import com.springboot.web.details.Details;

import java.util.List;

public interface ownerService {
    Details addDepartment(Details detail);

    Details updateDepartment(Details detail);

    void deleteById(Integer id);

    List<Details> getUsers();

//    Object getDepartment();
}
