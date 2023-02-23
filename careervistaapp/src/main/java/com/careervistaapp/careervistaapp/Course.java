package com.careervistaapp.careervistaapp;

public class Course {

    private long id;
    private String title;
    private String Instructor;
    private String description;

    private String response;

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public Course(long id, String title, String instructor, String description) {
        this.id = id;
        this.title = title;
        Instructor = instructor;
        this.description = description;
    }

    public Course()
    {
        super();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getInstructor() {
        return Instructor;
    }

    public void setInstructor(String instructor) {
        Instructor = instructor;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", Instructor='" + Instructor + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
