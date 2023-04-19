package com.example.demo.Controller;

import com.example.demo.Model.HotelModel;
import com.example.demo.Services.HotelServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Hotels")
public class HotelController {
    @Autowired
    private HotelServices hotelServices;



    @PostMapping("/addHotelName")

    public ResponseEntity<String> addHotel (@RequestBody HotelModel hotelModel){
        HotelModel hotelModel1=hotelServices.addHotel(hotelModel);
        return new ResponseEntity<>("Success", HttpStatus.ACCEPTED);
    }

    @GetMapping("/getAllHotels")
    public List<HotelModel>getAllHotels(){
        return hotelServices.getAllHotels();
    }

    @GetMapping("/{id}")
    public HotelModel getOneHotel(@PathVariable("id")String HotelId){

        return hotelServices.getHotelById(HotelId);
    }

}






