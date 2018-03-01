package com.company;

import java.util.ArrayList;

public class ArP {
    private ArrayList<Person> AP;
    public ArP(){
        AP = new ArrayList<Person>();
    }
    public void add(Person p){
        AP.add(p);
    }
    public void show(){
        for(Person x : AP){
            x.printDetails();
        }
    }
}
