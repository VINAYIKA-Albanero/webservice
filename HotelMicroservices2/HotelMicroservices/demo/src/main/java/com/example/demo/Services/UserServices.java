package com.example.demo.Services;

import com.example.demo.Model.UserModel;
import com.example.demo.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServices {
    @Autowired
    UserRepo userRepo;



    public  UserModel adduser(UserModel userModel) {
        UserModel user1 = userRepo.save(userModel);
        return user1;



    }

    public UserModel getUserById( String userId) {
        UserModel userModel= userRepo.findByUserId(userId);
                return userModel;

    }

        public List<UserModel> getAllUser(){
           List<UserModel> userModelList = userRepo.findAll();
           return userModelList;
       // return  userRepo.findAll();

        }




}




