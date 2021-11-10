package com.example.imarket_student_edition.Models;

import java.util.Date;

public class UserModel {
    private int id;
    private String name;
    private String email;
    private String password;
    private String dob;
    private String location;
    private String date_created;

    // Declare the constructor
    public UserModel(int id, String name, String email, String password, String dob, String location, String date_created) {
        System.out.println("Constructor for the model USER called");
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.dob = dob;
        this.location = location;
        this.date_created = date_created;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDate_created() {
        return date_created;
    }

    public void setDate_created(String date_created) {
        this.date_created = date_created;
    }

    // Overwrite the toString method
    @Override
    public String toString() {
        return "User ID: " + this.id + " Name: " + this.name + " Location: " + this.location;
    }
}
