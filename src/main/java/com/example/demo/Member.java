package com.example.demo;


import lombok.Data;
import org.springframework.stereotype.Repository;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Member {

    @Id
    @GeneratedValue
    private String id;
    private String password;
    private int inventoryKey;

    @Repository
    public static class ItemRepository {
    }

    @Repository
    public static class InventoryRepository {
    }

    @Repository
    public static class InventoryListRepository {
    }
}
