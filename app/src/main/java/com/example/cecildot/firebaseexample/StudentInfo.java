package com.example.cecildot.firebaseexample;

public class StudentInfo {
    private String rollnumber=null;
    private String name = null;

    public StudentInfo(String rollnumber, String name) {
        this.rollnumber = rollnumber;
        this.name = name;
    }

    public String getRollnumber() {

        return rollnumber;
    }

    public void setRollnumber(String rollnumber) {
        this.rollnumber = rollnumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
