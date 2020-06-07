/*
 *
 * Classname: Parallelogram
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

import java.util.Objects;

public class Parallelogram {

    private int biggestSide;
    private int smallerSide;
    private double Angle;

    // Constructors for class Parallelogram

    public Parallelogram() {
    }

    public Parallelogram(int biggestSide, int smallerSide, double Angle) {
        this.biggestSide = biggestSide;
        this.smallerSide = smallerSide;
        this.Angle = Angle;
    }

    // Getters and setters for class Parallelogram

    public int getBiggestSide() {
        return biggestSide;
    }

    public void setBiggestSide(int biggestSide) {
        this.biggestSide = biggestSide;
    }

    public int getSmallerSide() {
        return smallerSide;
    }

    public void setSmallerSide(int smallerSide) {
        this.smallerSide = smallerSide;
    }

    public double getAngle() {
        return Angle;
    }

    public void setAngle(double Angle) {
        this.Angle = Angle;
    }

    // Methods for class Parallelogram

    // 1. Method for finding the perimeter

    public double getPerimeter() {
        return 2 * this.getBiggestSide() + 2 * this.getSmallerSide();
    }

    // 2. Method for finding the Longest Diagonal

    public double getLongDiagonal() {
        return Math.sqrt(this.getBiggestSide() * this.getBiggestSide() +
                this.getSmallerSide() * this.getSmallerSide() + 2 *
                this.getBiggestSide() * this.getSmallerSide() *
                Math.cos(this.getAngle()));
    }

    // 3. Method for finding the Shortest Diagonal

    public double getShortDiagonal() {
        return Math.sqrt(this.getBiggestSide() * this.getBiggestSide() +
                this.getSmallerSide() * this.getSmallerSide() - 2 *
                this.getBiggestSide() * this.getSmallerSide() *
                Math.cos(this.getAngle()));
    }

    // 4. Method "Is Parallelogram a rhombus?"

    public boolean isRhombus() {

        boolean result = true;

        if (this.getBiggestSide() == this.getSmallerSide()) {
            result = true;
        } else {
            result = false;
        }

        return result;

    }

    // 5. Method "Is Parallelogram a Square?"

    public boolean isSquare() {

        boolean result = true;

        if (this.getBiggestSide() == this.getSmallerSide() &&
                this.getAngle() == Math.PI * 0.5) {
            result = true;
        } else {
            result = false;
        }

        return result;

    }

    // Method toString() for class Parallelogram

    @Override
    public String toString() {
        return "Parallelogram {" +
                "Big Side = " + biggestSide +
                ", Small Side = " + smallerSide +
                ", Angle = " + Angle +
                ", \nPerimeter = " + this.getPerimeter() +
                ", Long Diagonal = " + this.getLongDiagonal() +
                ", \nShort Diagonal = " + this.getShortDiagonal() +
                ", \nThis is Square? - " + this.isSquare() +
                ", This is Rhombus? - " + this.isRhombus() +
                '}' + "\n";
    }
}
