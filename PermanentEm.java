package com.company;

public class PermanentEm extends Employee{
    public int salary;
    public PermanentEm (String n, int a, String empid, int salary){
        super(n, a, empid);
        this.salary = salary;
    }

    public void setSalary(int salary){
        this.salary = salary;
    }

    public int getSalary(){
        return salary;
    }

    public void printDetails(){
        super.printDetails();
        System.out.println("Salary ="+ salary);
    }
}
