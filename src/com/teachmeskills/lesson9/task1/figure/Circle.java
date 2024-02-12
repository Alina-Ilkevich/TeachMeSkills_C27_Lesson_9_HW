package com.teachmeskills.lesson9.task1.figure;
public final class Circle extends Figure {
    //This class is used to describe a circle and
    //describe methods for calculating the perimeter and area of the circle
    public Circle(int side1) {
        super(side1);
    }
    @Override
    public double calculateArea() {
        return Math.PI * side1 * side1;
    }
    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * side1;
    }
}
