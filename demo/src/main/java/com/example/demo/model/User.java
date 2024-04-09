package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
public class User {

    @Id
    private String id;

    private String username;
    private String password;
    // Add more fields as needed

    public User() {
        // Default constructor required by Spring Data MongoDB
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Getters and setters for all fields
    // Omitted for brevity, but you should generate them for each field
}
