package com.example.APITask;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
@Builder
public class User {


    @Id
    private String id;
    private String Name;
    private int Age;
    private String Email;

}
