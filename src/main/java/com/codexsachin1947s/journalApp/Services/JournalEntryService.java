package com.codexsachin1947s.journalApp.Services;

import com.codexsachin1947s.journalApp.Repository.JournalEntryRepository;
import com.codexsachin1947s.journalApp.entites.JornalEntry;
import com.codexsachin1947s.journalApp.entites.Users;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
@Service
public class JournalEntryService {
    @Autowired
    private JournalEntryRepository journalEntryRepository;
    @Autowired
    private UserEntryService userEntryService;
    @Transactional
     public  void saveEntry(JornalEntry jornalEntry,String name){
              Users user = userEntryService.findByUsername(name);
              JornalEntry save = journalEntryRepository.save(jornalEntry);
              user.getJornalEntries().add(save);
              userEntryService.saveEntry(user);

     }
    public  void saveEntry(JornalEntry jornalEntry){
         journalEntryRepository.save(jornalEntry);
    }
     public List<JornalEntry> getAll(){
         return journalEntryRepository.findAll();
     }
     public Optional<JornalEntry> getById(ObjectId id){
       return    journalEntryRepository.findById(id);
     }
     public  void deletebyId(ObjectId id, String username){
         Users user = userEntryService.findByUsername(username);
         user.getJornalEntries().removeIf(entry -> entry.getId().equals(id));
         userEntryService.saveEntry(user);
         journalEntryRepository.deleteById(id);
     }


}
