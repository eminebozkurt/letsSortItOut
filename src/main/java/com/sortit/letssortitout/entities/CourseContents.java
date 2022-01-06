package com.sortit.letssortitout.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="coursecontents")
@Data
public class CourseContents {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="content",nullable = false)
    private String content;

    @ManyToMany(mappedBy = "courseContents")
    @JsonIgnore
    private List<Course> courses = new ArrayList<>();

    public void addCourse(Course course){
        this.courses.add(course);
    }

}
