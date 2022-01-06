package com.sortit.letssortitout.entities;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.time.ZonedDateTime;
import java.util.Date;

@Entity
@Table(name="employees")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    //@Min(value=1,message = "")
    private int id;

    @NotNull
    private String employeeName;

    @NotNull(message = "Department is required.")
   //@Pattern(regexp = "^[0-9A-Z]*$",message = "Department accepts only alphanumeric characters")
    @Size(min=10,max=50,message = "must be between 10 and 50")
    private String department;

    @NotNull
    @Temporal(TemporalType.DATE)
    @JsonFormat(pattern = "yyyy-mm-dd HH:mm:ss")
    private Date joiningDate;

    @NotNull(message="Age cannot be null")
    @Min(value=18,message="Age must be greater than 18")
    private int age;

    @NotNull(message = "Address is required.")
    private String address;

    @NotNull
    private float salary;

    private ZonedDateTime leftOn;

    @NotNull
    private boolean leftJob;




}
