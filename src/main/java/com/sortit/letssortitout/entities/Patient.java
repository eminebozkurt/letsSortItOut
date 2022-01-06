package com.sortit.letssortitout.entities;

import com.sortit.letssortitout.entities.PersonInfo;
import lombok.Data;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "patients")
@AttributeOverride(name = "entryDate", column = @Column(name="visitdate"))
public class Patient extends PersonInfo{

    private String symptoms;
    private String healthHistory;

}