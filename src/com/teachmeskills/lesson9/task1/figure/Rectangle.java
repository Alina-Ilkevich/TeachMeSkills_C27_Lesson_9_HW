package com.teachmeskills.lesson7.task2.figure;
import com.teachmeskills.lesson7.task2.figure.Figure;
public class Rectangle extends Figure {
    //This class is used to describe a rectangle and
    //describe methods for calculating the perimeter and area of the rectangle
    int side2;
    public Rectangle(int side1, int side2) {
        super(side1);
        this.side2 = side2;
    }
    @Override
    public double calculateArea() {
        return side1 * side2;
    }
    @Override
    public double calculatePerimeter() {
        return  2 * (side1 + side2);
    }
}
