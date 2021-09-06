package com.example.demo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Item {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String kinds;
    private String explain;
}
