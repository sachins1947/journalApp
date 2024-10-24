package com.codexsachin1947s.journalApp.Services;

import com.codexsachin1947s.journalApp.Repository.UserEntryRepository;
import com.codexsachin1947s.journalApp.entites.Users;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class UserEntryService {
    @Autowired
    private UserEntryRepository userEntryRepository;
    public  void saveEntry(Users userentry){
        userEntryRepository.save(userentry);
    }
    public List<Users> getAll(){
        return userEntryRepository.findAll();
    }
    public Optional<Users> getById(ObjectId id){
        return    userEntryRepository.findById(id);
    }
    public  void deletebyId(ObjectId id){
        userEntryRepository.deleteById(id);
    }
    public  Users findByUsername(String username){
        return userEntryRepository.findByname(username);
    }
}
