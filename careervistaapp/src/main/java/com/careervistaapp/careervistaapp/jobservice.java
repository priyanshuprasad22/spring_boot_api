package com.careervistaapp.careervistaapp;

import com.careervistaapp.careervistaapp.Jobs;

import java.util.List;

public interface jobservice {

    public List<Jobs> getjob();

    public String updateJobs(String response);

}
