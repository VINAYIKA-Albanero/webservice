package com.example.demo.Controller;

import com.example.demo.Model.HotelModel;
import com.example.demo.Model.UserModel;
import com.example.demo.Repository.UserRepo;
import com.example.demo.Services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/UserHit")
public class userController {
    @Autowired
   private UserServices userServices;
    private WebClient webClient = WebClient.create("Http://localhost:8081");
    HotelModel hotelModel= new HotelModel("1234","hotelInn","xyz square","hyd","telangana",4);
    @PostMapping("/adduser")
    public  UserModel adduser(@RequestBody UserModel userModel){
        HotelModel hotelModel1=webClient
                .post()
                .uri("Hotel/add")
                .syncBody(hotelModel)
                .retrieve()
                .bodyToMono(HotelModel.class)
                .block();
        UserModel userModel1= userServices.adduser(userModel);
        userModel1.getHoteslsList().add(hotelModel1);
        return userModel1;
    }
    @GetMapping("/getAll")
    public List<UserModel> getAllUser(){

        return userServices.getAllUser();
    }

    @GetMapping("/{Id}")
   public UserModel getUserById(@PathVariable("Id") String userId){
       return userServices.getUserById(userId);
//    public ResponseEntity<UserModel>findUserById(@PathVariable("id")String id){
//        Optional<UserModel> userModel= UserRepo.findById(id);
//        if(userModel.isPresent()){
//            return ResponseEntity.ok().body(userModel.get());
//
//        }else {
//            return ResponseEntity.notFound().build();
//        }

    }

}


