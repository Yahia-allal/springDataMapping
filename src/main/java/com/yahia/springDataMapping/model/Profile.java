package com.yahia.springDataMapping.model;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data

public class Profile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String bio ;

    @OneToOne(mappedBy = "profile")
    private User user;

}
