package com.sortit.letssortitout.dataAccess;

import com.sortit.letssortitout.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course,Integer> {
    Course findById(int id);
}
