package com.example.demo.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Document(collection = "Hotels")
public class HotelModel {
    @Id
    private String HotelId;
    private String HotelName;
    private String address;
    private String city;
    private  String state;
    private double ratings;
}

