package com.example.travel_agency_client.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Data
public class Hike {

    private String hikeId;

    private String name;
    private String date;
    private int duration;
    private int complexity; //0-6
    private int min_age;
    private int  max_people;
    private double price;

    private Instructor instructor;

    List<Order> orders = new ArrayList<>();

    public Hike(String name, String date, int duration, int complexity, int min_age, int max_people,
                double price, Instructor instructor){
        this.hikeId = UUID.randomUUID().toString();
        this.name = name;
        this.date = date;
        this.duration = duration;
        this.complexity = complexity;
        this.min_age = min_age;
        this.max_people = max_people;
        this.price = price;
        this.instructor = instructor;
    }

    public void changeInstructor(Instructor instructor){
        this.instructor = instructor;
    }

    public double getPrice(){return this.price;}

    public int getComplexity(){return this.complexity;}

    public int getMin_age(){return this.min_age;}

    public int getMax_people(){return  this.max_people;}

    public String getName(){return this.name;}
}

