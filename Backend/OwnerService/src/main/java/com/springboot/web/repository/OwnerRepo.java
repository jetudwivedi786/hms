package com.springboot.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.web.model.Details;

public interface OwnerRepo extends JpaRepository<Details, Integer> {

    void deleteById(Details user);
}
