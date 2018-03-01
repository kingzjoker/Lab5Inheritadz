package com.company;

public class Student extends Person {
    public String major;
    public double gpa;
    public Student (String n, int a,String major,double gpa){
        super(n,a);
        this.major = major;
        this.gpa = gpa;
    }

    public void setMajor(String major){
        this.major = major;
    }

    public void setGpa(int gpa){
        this.gpa = gpa;
    }

    public String getMajor(){
        return major;
    }

    public double getGpa(){
        return gpa;
    }

    public void printDetails(){
        super.printDetails();
        System.out.println("Major"+ major);
        System.out.println("GPA"+ gpa);
    }

}
