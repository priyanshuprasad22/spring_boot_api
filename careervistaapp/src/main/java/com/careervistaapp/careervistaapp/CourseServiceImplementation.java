package com.careervistaapp.careervistaapp;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseServiceImplementation implements courseservice {

    List<Course> list;

    List<String> responselist;

    public CourseServiceImplementation()
    {
        list=new ArrayList<>();
        list.add(new Course(145,"Java Core Course","Steve John","Java for all"));
        list.add(new Course(146,"Python Core Course","Steve John","Python for all"));
        list.add(new Course(147,"C++ Core Course","Steve John","C++ for all"));
    }

    @Override
    public List<Course> getCourse() {
        return list;
    }

    @Override
    public String updateCourse(String response) {

        responselist=new ArrayList<>();

        responselist.add(response);

        Course course=new Course();
        course.setResponse(response);

        return response;


    }
}
