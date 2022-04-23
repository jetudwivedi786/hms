package com.springboot.web.service;

import com.springboot.web.model.staffDetails;

public interface staffService {

    Object getAllstaff();

    Object findById(Integer id);

    staffDetails addStaff(staffDetails detail);

    staffDetails updateStaff(staffDetails detail);

    void deleteById(Integer id);

}
