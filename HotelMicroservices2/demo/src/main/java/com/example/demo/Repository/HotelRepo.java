package com.example.demo.Repository;

import com.example.demo.Model.HotelModel;
import org.springframework.stereotype.Repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelRepo extends  MongoRepository<HotelModel,String>{

     HotelModel findByHotelId(String id) ;
}
