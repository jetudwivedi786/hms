package com.springboot.web.service;

import com.springboot.web.model.Details;

import java.util.List;

public interface GuestService {
    public List<Details>  getAllGuest();

    String deleteById(Integer id);

    Details save(Details detail);

    Object getById(Details id);

    List<Details> getAlGuest();

    Details updateGuest(Details detail);
}
