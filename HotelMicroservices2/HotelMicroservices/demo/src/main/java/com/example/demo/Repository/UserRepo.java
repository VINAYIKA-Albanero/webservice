package com.example.demo.Repository;

import com.example.demo.Model.UserModel;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Map;
import java.util.Optional;

public interface UserRepo extends MongoRepository<UserModel,String> {

     UserModel findByUserId(String userId);
}
