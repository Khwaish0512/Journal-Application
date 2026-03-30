package com.khwaish.journalApp.repository;

import com.khwaish.journalApp.entity.JournalEntry;
import com.khwaish.journalApp.entity.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, ObjectId> {
    User findByUserName(String username);
}
