package com.careervistaapp.careervistaapp;

public class mentoring {

    public String name,experience,couresofferd,timeslot;

    public mentoring(String name, String experience, String couresofferd, String timeslot) {
        this.name = name;
        this.experience = experience;
        this.couresofferd = couresofferd;
        this.timeslot = timeslot;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getCouresofferd() {
        return couresofferd;
    }

    public void setCouresofferd(String couresofferd) {
        this.couresofferd = couresofferd;
    }

    public String getTimeslot() {
        return timeslot;
    }

    public void setTimeslot(String timeslot) {
        this.timeslot = timeslot;
    }

    @Override
    public String toString() {
        return "mentoring{" +
                "name='" + name + '\'' +
                ", experience='" + experience + '\'' +
                ", couresofferd='" + couresofferd + '\'' +
                ", timeslot='" + timeslot + '\'' +
                '}';
    }

    private String response;

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    mentoring()
    {

    }
}
