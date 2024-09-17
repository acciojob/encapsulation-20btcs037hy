package com.driver;

// Task 1
public class Main {
    
    public static void main(String s[]){
        // Task 3
        RWOnly obj = new RWOnly();
        // Task 4
        // obj.name = "AquibEzaz";
        obj.setName("AquibEzaz");

        System.out.println("Here i am "+obj.getName());

        System.out.println(obj.getName());

    }
}