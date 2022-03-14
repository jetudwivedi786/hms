package com.springboot.web.service;

import com.springboot.web.details.Details;

import java.util.List;

public interface guestService {
    public List<Details>  getAllGuest();
    public Details updateGuest(Details details);

    void deleteById(Integer id);

    Details save(Details detail);

    Object getById(Details id);
}
