package com.careervistaapp.careervistaapp;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class mentorimplementation implements mentorship{
    List<mentoring> list;
    List<String> responselist;


    public mentorimplementation()
    {
        list=new ArrayList<>();
        list.add(new mentoring("David","2 years","C++ is great, Python Programming","5-6 pm, 7-8 pm"));
    }

    @Override
    public List<mentoring> getmentor() {
        return list;

    }

    @Override
    public String updatementoring(String response) {

        responselist =new ArrayList<>();

        responselist.add(response);

        mentoring mentor=new mentoring();
        mentor.setResponse(response);

        return response;

    }
}
