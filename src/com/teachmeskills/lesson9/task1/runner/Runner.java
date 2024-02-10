package com.teachmeskills.lesson7.task2.runner;
import com.teachmeskills.lesson7.task2.figure.*;
public class Runner {
    public static void main(String[] args) {
        //This class is used to check the written code
        Triangle triangle1 = new Triangle(2, 4, 5, 6);
        Rectangle rectangle1 = new Rectangle(5, 8);
        Triangle triangle2 = new Triangle(9, 3, 4, 1);
        Circle circle1 = new Circle(5);
        Rectangle rectangle2 = new Rectangle(9, 2);
        double sum = 0.0;
        Figure[] arr = {triangle1, rectangle1, triangle2, circle1, rectangle2};
        for (Figure fig : arr) {
            System.out.println("Perimeter: " + fig.calculatePerimeter() +
                    " Area: " + fig.calculateArea());
            sum = sum + fig.calculatePerimeter();
        }
        System.out.println("The sum of the perimeters of all shapes: " + sum);
    }
}
