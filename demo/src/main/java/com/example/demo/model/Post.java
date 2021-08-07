package com.example.demo.model;


import javax.persistence.*;
import java.security.Timestamp;
import java.time.LocalDate;

@Entity
public class Post {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;

    String body;
    LocalDate createdAt;

    @ManyToOne
    AppUser appUser;

    public Post(){}

    public Post(String body, LocalDate createdAt, AppUser appUser) {
        this.body = body;
        this.createdAt = createdAt;
        this.appUser = appUser;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

    public AppUser getAppUser() {
        return appUser;
    }

    public void setAppUser(AppUser appUser) {
        this.appUser = appUser;
    }
}