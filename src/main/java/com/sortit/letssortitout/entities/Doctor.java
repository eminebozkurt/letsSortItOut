package com.sortit.letssortitout.entities;

import lombok.Data;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Data
@Table(name="doctors")
@AttributeOverride(name = "entryDate", column = @Column(name="joiningdate"))
public class Doctor extends PersonInfo{

    private String roomNo;
    private String specialization;

}
