package org.fasttrackit;


import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.Month;

public class Food {

    String name;
    double price;
    double quantity;
    LocalDate expirationDate;

    public Food(String name) {
        this.name = name;
    }
}
