package com.teachmeskills.lesson9.task1.figure;
public final class Triangle extends Figure {
    //This class is used to describe a circle and
    //describe methods for calculating the perimeter and area of the triangle
    int h;
    int side2;
    int side3;
    public Triangle(int side1, int h, int side2, int side3) {
        super(side1);
        this.h = h;
        this.side2 = side2;
        this.side3 = side3;
    }
    @Override
    public double calculateArea() {
        return  ((side1 *h) / 2);
    }
    @Override
    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }
}
