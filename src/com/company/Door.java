/*
 *
 * Classname: Door
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
 * Or create a daughter class for your one.
 *
 */

package com.company;

public class Door extends Rectangle {

    private String material;
    private int price;
    private String color;
    private boolean lock;

    // Constructor for class Door

    public Door(int length, int width, String material, int price, String color, boolean lock) {
        super(length, width);
        this.material = material;
        this.price = price;
        this.color = color;
        this.lock = lock;
    }

    // Getters and setters for class Door

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isLock() {
       return lock;
    }

    public void setLock(boolean lock) {
        this.lock = lock;
    }

    // Method toString() for class Door with Rectangle's methods

    @Override
    public String toString() {
        return "Door: " +
                "\nlength = " + super.getLength() +
                "\nwidth = " + super.getWidth() +
                "\nperimeter = " + super.getPerimeter() +
                "\narea = " + super.getArea() +
                "\nmaterial = '" + material + '\'' +
                "\nprice = " + price +
                "\ncolor = '" + color + '\'' +
                "\nlock = " + lock +
                "\n";
    }
}