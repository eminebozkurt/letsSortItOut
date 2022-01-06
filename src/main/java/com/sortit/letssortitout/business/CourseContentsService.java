package com.sortit.letssortitout.business;

import com.sortit.letssortitout.dataAccess.CourseContentsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CourseContentsService {

    private final CourseContentsRepository courseContentsRepository;

}
