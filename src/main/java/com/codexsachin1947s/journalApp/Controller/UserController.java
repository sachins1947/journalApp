package com.codexsachin1947s.journalApp.Controller;

import com.codexsachin1947s.journalApp.Services.UserEntryService;
import com.codexsachin1947s.journalApp.entites.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/User")
public class UserController {
    @Autowired
    UserEntryService userEntryService;
    @GetMapping
     public List<Users> getUsers() {
         return  userEntryService.getAll();
     }
     @PostMapping
     public boolean createUser(@RequestBody  Users user) {
         userEntryService.saveEntry(user);
         return true;
     }
     @PutMapping("/{name}")
     public ResponseEntity<?> updateUser(@RequestBody Users user , @PathVariable String name) {
         Users u =  userEntryService.findByUsername(name);
         if( u != null  ){
              u.setName(user.getName());
              u.setPassword(user.getPassword());
              userEntryService.saveEntry(u);
              return new ResponseEntity<>(u, HttpStatus.NO_CONTENT);
         }
         return new ResponseEntity<>(HttpStatus.NOT_FOUND);
     }
}
