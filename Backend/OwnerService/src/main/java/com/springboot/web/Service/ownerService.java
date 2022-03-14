package com.springboot.web.Service;

import com.springboot.web.details.Details;

public interface ownerService {
    Details addDepartment(Details detail);

    Details updateDepartment(Details detail);

    void deleteById(Integer id);

    Object getDepartment();
}
