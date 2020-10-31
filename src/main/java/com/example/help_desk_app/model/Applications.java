package com.example.help_desk_app.model;

import javax.persistence.*;

@Entity
@Table(name = "APPLICATIONS_TABLE")
public class Applications {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String priority_of_the_request;
private String user;
private String description;

    public Applications() {
    }

    public Applications(Long id, String priority_of_the_request, String user, String description) {
        this.id = id;
        this.priority_of_the_request = priority_of_the_request;
        this.user = user;
        this.description = description;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPriority_of_the_request() {
        return priority_of_the_request;
    }

    public void setPriority_of_the_request(String priority_of_the_request) {
        this.priority_of_the_request = priority_of_the_request;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
