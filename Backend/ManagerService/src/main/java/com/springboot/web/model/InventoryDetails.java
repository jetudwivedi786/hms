package com.springboot.web.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "inventery")

@Data
public class InventoryDetails {
    @Id
    private int id;
    private int beds;
    private int tables;
    private int chairs;
    private int pillow;
    private int bedsheet;
    private int mattress;


}
