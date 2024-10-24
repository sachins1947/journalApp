package com.codexsachin1947s.journalApp.Repository;

import com.codexsachin1947s.journalApp.entites.Users;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserEntryRepository  extends MongoRepository<Users, ObjectId> {
   Users findByname(String username);
}
