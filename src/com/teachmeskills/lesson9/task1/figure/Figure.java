package com.teachmeskills.lesson7.task2.figure;
public abstract class Figure {
    //This abstract class is used to create a common characteristic of all shapes
    // and add methods to find the perimeter and area of the shapes
    int side1;
    public Figure(int side1) {
        this.side1 = side1;
    }
    public abstract double calculateArea();
    public abstract double calculatePerimeter();
}
