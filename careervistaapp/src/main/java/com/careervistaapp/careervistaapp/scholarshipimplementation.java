package com.careervistaapp.careervistaapp;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class scholarshipimplementation implements Scholarships {

    List<scholarship> list;
    List<String> responselist;

    public scholarshipimplementation()
    {
        list=new ArrayList<>();
        list.add(new scholarship("12th Marks","3000 per month","1 year"));
        list.add(new scholarship("10th Marks","3000 per month","1 year"));
        list.add(new scholarship("10th Marks and 12th Marks","3000 per month","1 year"));

    }

    @Override
    public List<scholarship> getScholarship() {
        return list;
    }

    @Override
    public String updatescholarship(String response) {

        responselist=new ArrayList<>();
        responselist.add(response);

        scholarship scholar=new scholarship();
        scholar.setResponse(response);
        return response;



    }


}
