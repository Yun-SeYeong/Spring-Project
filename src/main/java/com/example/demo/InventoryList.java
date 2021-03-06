package com.example.demo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class InventoryList {
    @Id
    @GeneratedValue
    private int inventoryId;
    private int itemId;
}
