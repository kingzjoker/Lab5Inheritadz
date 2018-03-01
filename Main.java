package com.company;

public class Main {

    public static void main(String[] args) {


        Person p1 = new Person( "Oil",23);
        Person p2 = new Person ("Jam",22);
        Person pe1 = new Employee ("Oil",23,  "5635512048");
        Person pe2 = new Employee ("Jam",22,  "5635512099");
        Person pt1 = new Teacher ("Oil",22,"CoE");
        Person pt2 = new Teacher ("Oil",22,"FIS");
        Person ps1 = new Student ("Oil",22, "Computer Enginer", 4.00);
        Person ps2 = new Student ("Oil",22, "HOPITAL",4.00);



        //String name = p1.getName();
        //String str = ((Employee)p1).getId();

        ArP pp = new ArP();
        pp.add(p1);
        pp.add(p2);
        pp.add(pe1);
        pp.add(pe2);
        pp.add(pt1);
        pp.add(pt2);
        pp.add(ps1);
        pp.add(ps2);
        pp.show();
    }
}
