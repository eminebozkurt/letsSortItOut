package com.sortit.letssortitout.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@MappedSuperclass
@Data
public abstract class PersonInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int age;
    private String address;
    private String city;
    private String contactNo;
    private String emailId;

    @Temporal(TemporalType.DATE)
    private Date entryDate;


}
