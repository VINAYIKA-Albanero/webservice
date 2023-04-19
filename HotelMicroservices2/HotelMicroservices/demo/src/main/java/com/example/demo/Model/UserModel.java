package com.example.demo.Model;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

@Document(collection = "User")
public class UserModel {
    @Id
    public   String userId;
    public String name;
    public String email;
    public   String about;
    public String nationality;
   List<HotelModel> HoteslsList = new ArrayList<>();

}


