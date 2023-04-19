package com.example.demo.Services;

import com.example.demo.Model.HotelModel;
import com.example.demo.Repository.HotelRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class HotelServices {
    @Autowired
     HotelRepo hotelRepo;


    public HotelModel addHotel(HotelModel hotelModel) {
        hotelRepo.save(hotelModel);
        return  hotelModel;

    }


    public List<HotelModel> getAllHotels() {
        List<HotelModel> HotelList = hotelRepo.findAll();
        return HotelList;
    }


    public  HotelModel getHotelById(String HotelId) {
        HotelModel hotelModel = hotelRepo.findByHotelId(HotelId);
        return hotelModel;
    }
}










