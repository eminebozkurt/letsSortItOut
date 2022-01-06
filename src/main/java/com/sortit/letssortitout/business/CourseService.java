package com.sortit.letssortitout.business;

import com.sortit.letssortitout.dataAccess.CourseContentsRepository;
import com.sortit.letssortitout.dataAccess.CourseRepository;
import com.sortit.letssortitout.entities.Course;
import com.sortit.letssortitout.entities.CourseContents;
import com.sortit.letssortitout.entities.dtos.CourseRequest;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CourseService{
    private final CourseRepository courseRepository;
    private final CourseContentsRepository courseContentsRepository;

    public Course addCourseWithContents(CourseRequest courseRequest){
        Course course = new Course();
        course.setId(courseRequest.getId());
        course.setCourseName(courseRequest.getCourseName());
        course.setCourseContents(courseRequest.getCourseContents()
                .stream()
                .map(courseContent -> {
                    CourseContents ccontents = courseContent;
                    if(ccontents.getId()>0){
                        ccontents = courseContentsRepository.findById(ccontents.getId());
                    }
                    ccontents.addCourse(course);
                    return  ccontents;
                })
                .collect(Collectors.toList()));
        return courseRepository.save(course);

    }

}
