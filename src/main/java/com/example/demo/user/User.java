package com.example.demo.user;
import jakarta.persistence.*;

import java.util.ArrayList;
@Entity
@Table
public class User {
    @Id
    private Long id;
    private String name;
    private String email;
    private String password;
    private String phoneNumber;
    @OneToMany
    private ArrayList<Appointment> appointments;
    public User(String name, String email, String password, ArrayList<Appointment> appointments, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.appointments = appointments;
        this.phoneNumber = phoneNumber;
    }

    public User(Long id, String name, String email, String password, ArrayList<Appointment> appointments, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.appointments = appointments;
        this.phoneNumber = phoneNumber;
    }

    public User() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public ArrayList<Appointment> getAppointments() {
        return appointments;
    }

    public void setAppointments(ArrayList<Appointment> appointments) {
        this.appointments = appointments;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", appointments=" + appointments +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
