package com.sortit.letssortitout.entities.dtos;

import com.sortit.letssortitout.entities.CourseContents;
import lombok.Data;

import java.util.List;

@Data
public class CourseRequest {
    private int id;
    private String courseName;
    private List<CourseContents> courseContents;
}
