package com.codexsachin1947s.journalApp.Repository;

import com.codexsachin1947s.journalApp.entites.JornalEntry;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JournalEntryRepository  extends MongoRepository<JornalEntry, ObjectId> {
}
