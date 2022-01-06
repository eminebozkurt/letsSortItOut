package com.sortit.letssortitout.dataAccess;

import com.sortit.letssortitout.entities.CourseContents;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseContentsRepository extends JpaRepository<CourseContents,Integer> {
    CourseContents findById(int id);
}
