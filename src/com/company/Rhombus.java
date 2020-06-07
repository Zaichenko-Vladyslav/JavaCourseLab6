/*
 *
 * Classname: Rhombus
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

public class Rhombus extends Parallelogram {

    private int side;
    private double angle;

    // Constructor for class Rhombus

    public Rhombus(int side, double angle) {
        super(side, side, angle);
        this.side = side;
        this.angle = angle;
    }

    // Getters and setters for class Rhombus

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public double getAngle() {
        return angle;
    }

    @Override
    public void setAngle(double angle) {
        this.angle = angle;
    }

    // Method toString() for class Rhombus with Parallelogram's methods

    @Override
    public String toString() {
        return "Rhombus {" +
                "Rhombus side = " + side +
                ", Rhombus angle = " + angle +
                ", \nPerimeter = " + getPerimeter() +
                ", Long Diagonal = " + getLongDiagonal() +
                ", \nShort Diagonal = " + getShortDiagonal() +
                ", \nThis is Square? - " + isSquare() +
                ", This is Rhombus? - " + isRhombus() +
                '}';
    }
}