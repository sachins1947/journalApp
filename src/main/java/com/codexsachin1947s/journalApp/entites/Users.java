package com.codexsachin1947s.journalApp.entites;

import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Document
public class Users {
    @Id
    private ObjectId id;

    @Indexed(unique = true)
    private String name;
    private String password;

    @DBRef
    private List<JornalEntry> jornalEntries = new ArrayList<>();

    // Getter for id
    public ObjectId getId() {
        return id;
    }

    // Setter for id
    public void setId(ObjectId id) {
        this.id = id;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for password
    public String getPassword() {
        return password;
    }

    // Setter for password
    public void setPassword(String password) {
        this.password = password;
    }

    // Getter for jornalEntries
    public List<JornalEntry> getJornalEntries() {
        return jornalEntries;
    }

    // Setter for jornalEntries
    public void setJornalEntries(List<JornalEntry> jornalEntries) {
        this.jornalEntries = jornalEntries;
    }
}
