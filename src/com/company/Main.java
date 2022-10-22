/*
 *
 * Classname: Main
 *
 * 07 June 2020
 *
 * Copyright Zaichenko Vladyslav KNUTE
 *
 * Module 2 task 2
 *
 * Inheritance
 * 1. Create a child  from the class Rectangle.
 * 2. Create another class as a super class for your one.
 * Or create a daughterly class for your one.
 *
 */

package com.company;

public class Main {

    public static void main(String[] args) {

        Door entranceDoor = new Door (1,3,"metal",3600,"white",true);
        System.out.println(entranceDoor);

        Rhombus rhombus = new Rhombus(3,Math.PI * 0.5);
        System.out.println(rhombus);
    }
}


