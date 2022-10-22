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
 * 1. Create a child from the class Rectangle.
 * 2. Create another class as a super class for your one.
 * Or create a daughter class for your one.
 *
 */

package com.company;

public class Parallelogram {

    private int bigSide;
    private int smallSide;
    private double angle;

    // Constructors for class Parallelogram

    public Parallelogram() {

    }

    public Parallelogram(int bigSide, int smallSide, double angle) {
        this.bigSide = bigSide;
        this.smallSide = smallSide;
        this.angle = angle;
    }

    // Getters and setters for class Parallelogram

    public int getBigSide() {
        return bigSide;
    }

    public void setBigSide(int bigSide) {
        this.bigSide = bigSide;
    }

    public int getSmallSide() {
        return smallSide;
    }

    public void setSmallSide(int smallSide) {
        this.smallSide = smallSide;
    }

    public double getAngle() {
        return angle;
    }

    public void setAngle(double angle) {
        this.angle = angle;
    }

    // Methods for class Parallelogram

    // 1. Method for finding the perimeter

    public double getPerimeter() {
        return 2 * this.getBigSide() + 2 * this.getSmallSide();
    }

    // 2. Method for finding the Longest Diagonal

    public double getLongDiagonal() {
        return Math.sqrt(this.getBigSide() * this.getBigSide() +
                this.getSmallSide() * this.getSmallSide() + 2 *
                this.getBigSide() * this.getSmallSide() *
                Math.cos(this.getAngle()));
    }

    // 3. Method for finding the Shortest Diagonal

    public double getShortDiagonal() {
        return Math.sqrt(this.getBigSide() * this.getBigSide() +
                this.getSmallSide() * this.getSmallSide() - 2 *
                this.getBigSide() * this.getSmallSide() *
                Math.cos(this.getAngle()));
    }

    // 4. Method for checking if parallelogram is a rhombus

    public boolean isRhombus() {

        boolean result = true;

        if (this.getBigSide() == this.getSmallSide()) {
            result = true;
        } else {
            result = false;
        }

        return result;
    }

    // 5. Method for checking if parallelogram is a square

    public boolean isSquare() {

        boolean result = true;

        if (this.getBigSide() == this.getSmallSide() &&
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
        return "Parallelogram: " +
                "\nBig Side = " + bigSide +
                "\nSmall Side = " + smallSide +
                "\nAngle = " + angle +
                "\n" +
                "\nPerimeter = " + this.getPerimeter() +
                "\nLong Diagonal = " + this.getLongDiagonal() +
                "\nShort Diagonal = " + this.getShortDiagonal() +
                "\nThis is Square? - " + this.isSquare() +
                "\nThis is Rhombus? - " + this.isRhombus() +
                "\n";
    }
}
