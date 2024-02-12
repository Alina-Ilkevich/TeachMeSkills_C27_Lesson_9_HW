package com.teachmeskills.lesson9.task1.figure;
public abstract sealed class Figure permits Circle, Rectangle, Triangle{
    //This abstract class is used to create a common characteristic of all shapes
    // and add methods to find the perimeter and area of the shapes
    int side1;
    public Figure(int side1) {
        this.side1 = side1;
    }
    public abstract double calculateArea();
    public abstract double calculatePerimeter();
}
