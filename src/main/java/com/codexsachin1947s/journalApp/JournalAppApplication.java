package com.codexsachin1947s.journalApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.MongoDatabaseFactory;
import org.springframework.data.mongodb.MongoTransactionManager;
import org.springframework.data.mongodb.core.MongoTemplate;  // Import MongoTemplate
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories; // Import for enabling Mongo repositories

@SpringBootApplication
@EnableTransactionManagement
@EnableMongoRepositories(basePackages = "com.codexsachin1947s.journalApp.Repository") // Enable MongoDB repositories
public class JournalAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(JournalAppApplication.class, args);
    }

    // @Bean
    // public PlatformTransactionManager transactionManager(MongoDatabaseFactory dbFactory) {
    //     return new MongoTransactionManager(dbFactory);
    // }

    @Bean
    public MongoTemplate mongoTemplate(MongoDatabaseFactory mongoDatabaseFactory) {
        return new MongoTemplate(mongoDatabaseFactory); // Ensure MongoTemplate bean is available
    }
}
