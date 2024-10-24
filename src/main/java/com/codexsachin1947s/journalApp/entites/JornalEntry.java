package com.codexsachin1947s.journalApp.entites;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.LocalTime;

@Document(collection = "journal_entries")
public class JornalEntry {
    @Id
    private ObjectId id;
    private String name;
    private String description;
    private LocalTime date;

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

    // Getter for description
    public String getDescription() {
        return description;
    }

    // Setter for description
    public void setDescription(String description) {
        this.description = description;
    }

    // Getter for date
    public LocalTime getDate() {
        return date;
    }

    // Setter for date
    public void setDate(LocalTime date) {
        this.date = date;
    }
}
