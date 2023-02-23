package com.careervistaapp.careervistaapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class controller {


    @Autowired
    private CourseServiceImplementation courseServiceImplementation;

    @Autowired
    private Jobsimplement jobsimplement;

    @Autowired
    private scholarshipimplementation scholar;

    @Autowired
    private mentorimplementation mentor;

    @GetMapping("/home")
    public String home()
    {
        return "Welcome to CareerVista";
    }


    @GetMapping("/courses")
    public List<Course> getCourses()
    {
        return this.courseServiceImplementation.getCourse();
    }

    @GetMapping("/jobs")
    public List<Jobs> getJobs(){
        return this.jobsimplement.getjob();
    }

    @GetMapping("/scholarships")
    public List<scholarship> getScholarship()
    {
        return this.scholar.getScholarship();
    }

    @GetMapping("/mentoring")
    public List<mentoring> getmentor()
    {
        return this.mentor.getmentor();
    }

    @PostMapping("/search/courses")
    public String updatecourse(@RequestBody String response)
    {
        return this.courseServiceImplementation.updateCourse(response);
    }

    @PostMapping("/search/jobs")
    public String updatejobs(@RequestBody String response)
    {
        return this.jobsimplement.updateJobs(response);
    }

    @PostMapping("/search/scholarships")
    public String updateScholar(@RequestBody String response)
    {
        return this.scholar.updatescholarship(response);
    }

    @PostMapping("/search/mentoring")
    public String updatementor(@RequestBody String response)
    {
        return this.mentor.updatementoring(response);
    }







}
