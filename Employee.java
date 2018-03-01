package com.company;

public class Employee extends Person {
    public String employeeId;
    public Employee(String n,int a,String empid){
        super(n,a);
        employeeId = empid;
    }
    public void setId(String id){
        employeeId = id;
    }
    public String getId(){
        return employeeId;
    }

    public void printDetails() {
        super.printDetails();
        System.out.println("EmployeeId : " + employeeId);
    }
}
