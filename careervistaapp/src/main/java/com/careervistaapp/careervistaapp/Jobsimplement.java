package com.careervistaapp.careervistaapp;

import com.careervistaapp.careervistaapp.Jobs;
import com.careervistaapp.careervistaapp.jobservice;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Jobsimplement implements jobservice {

    List<Jobs>list;

    List<String> responselist;

    public Jobsimplement()
    {
        list=new ArrayList<>();
        list.add(new Jobs(203,"SoftWare Developer","Programming Knowledge","B.Tech",20000));
        list.add(new Jobs(204,"Python Developer","Programming Knowledge","B.Tech",20000));
        list.add(new Jobs(205,"C++ Developer","Programming Knowledge","B.Tech",20000));
        list.add(new Jobs(206,"Android Developer","Programming Knowledge","B.Tech",20000));
        list.add(new Jobs(207,"UI/UX Developer","Programming Knowledge","B.Tech",20000));


    }

    @Override
    public List<Jobs> getjob() {
        return list;
    }

    @Override
    public String updateJobs(String response) {
        responselist=new ArrayList<>();

        responselist.add(response);

        Jobs course=new Jobs();
        course.setResponse(response);

        return response;
    }

}
