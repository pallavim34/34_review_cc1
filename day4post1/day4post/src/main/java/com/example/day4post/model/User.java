package com.example.day4post.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Makeup")
public class User
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String email;
    private String password;
    private String address;
    private int mobilenumber;
    private int age;
    private String gender;
    private String makeupbrand;
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
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public int getMobilenumber() {
        return mobilenumber;
    }
    public void setMobilenumber(int mobilenumber) {
        this.mobilenumber = mobilenumber;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getMakeupbrand() {
        return makeupbrand;
    }
    public void setMakeupbrand(String makeupbrand) {
        this.makeupbrand = makeupbrand;
    }
    public User(int id, String name, String email, String password, String address, int mobilenumber, int age,
            String gender, String makeupbrand) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.address = address;
        this.mobilenumber = mobilenumber;
        this.age = age;
        this.gender = gender;
        this.makeupbrand = makeupbrand;
    }
    public User() {
    }

    
}
