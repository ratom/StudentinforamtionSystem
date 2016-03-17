/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.atom.sis.entity;

/**
 *
 * @author rabin dulal
 */
public class Student {
    int id;
    String firstName,lastName,phoneNo,email;
    boolean ststus;

    public Student() {
    }

    public Student(int id, String firstName, String lastName, String phoneNo, String email, boolean ststus) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNo = phoneNo;
        this.email = email;
        this.ststus = ststus;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isStstus() {
        return ststus;
    }

    public void setStstus(boolean ststus) {
        this.ststus = ststus;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", phoneNo=" + phoneNo + ", email=" + email + ", ststus=" + ststus + '}';
    }
    
    
    
}
