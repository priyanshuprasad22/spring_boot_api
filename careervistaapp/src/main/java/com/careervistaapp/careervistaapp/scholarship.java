package com.careervistaapp.careervistaapp;

public class scholarship {

    public scholarship(String elegibility, String amount, String duration) {
        this.elegibility = elegibility;
        this.amount = amount;
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "scholarship{" +
                "elegibility='" + elegibility + '\'' +
                ", amount='" + amount + '\'' +
                ", duration='" + duration + '\'' +
                '}';
    }

    public String getElegibility() {
        return elegibility;
    }

    public void setElegibility(String elegibility) {
        this.elegibility = elegibility;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    String elegibility,amount,duration;

    private String response;

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    scholarship()
    {

    }


}
