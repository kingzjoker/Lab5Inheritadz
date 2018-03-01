package com.company;

public class Teacher extends Person {
    public String faculty;
    public Teacher(String n, int a, String faculty) {
        super(n, a);
        this.faculty = faculty;
    }
    public void setFac(String fac){
        faculty = fac;
    }

    public String getFac(){
        return faculty;
    }

    public void printDetails() {
        super.printDetails();
        System.out.println("Faculty : " + faculty);
    }
}
