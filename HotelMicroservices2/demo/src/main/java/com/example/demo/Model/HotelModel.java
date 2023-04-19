package com.example.demo.Model;
import org.springframework.data.annotation.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.*;



@NoArgsConstructor
@AllArgsConstructor
@Data
@Document(collection = "Hotels")
public class HotelModel {
    @Id
    private String hotelId;
    private String HotelName;
    private String address;
    private String city;
    private  String state;
    private double ratings;
}

