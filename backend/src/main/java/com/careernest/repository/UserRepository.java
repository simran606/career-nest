package com.careernest.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.careernest.model.input.*;;

@Repository
public interface UserRepository extends MongoRepository<UserInputModel, String> {
    UserInputModel findByEmail(String email);
}
