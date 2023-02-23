package com.careervistaapp.careervistaapp;

public class Jobs {

    private String role,description,qualification;
    long salary,id;

    private String response;

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    Jobs()
    {

    }

    public Jobs(long id, String role, String description, String qualification, long salary) {
        this.id = id;
        this.role = role;
        this.description = description;
        this.qualification = qualification;
        this.salary = salary;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Jobs{" +
                "id='" + id + '\'' +
                ", role='" + role + '\'' +
                ", description='" + description + '\'' +
                ", qualification='" + qualification + '\'' +
                ", salary=" + salary +
                '}';
    }
}
