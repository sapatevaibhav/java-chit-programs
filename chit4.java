//~Design a base class shape with two double type values and member functions to input the data and compute_area() for calculating area of shape. Derive two classes: triangle and rectangle. Make compute_area() as abstract function and redefine this function in the derived class to suit their requirements. Write a program that accepts dimensions of triangle/rectangle and display calculated area.

abstract class Shape {
    // two double type values for the dimensions of the shape
    protected double dimension1;
    protected double dimension2;

    // member function to input the data for the dimensions of the shape
    public void inputDimensions(double d1, double d2) {
        dimension1 = d1;
        dimension2 = d2;
    }

    // abstract function to compute the area of the shape
    public abstract double computeArea();
}

class Triangle extends Shape {
    // override the computeArea function to calculate the area of a triangle

    public double computeArea() {
        return 0.5 * dimension1 * dimension2;
    }
}

class Rectangle extends Shape {
    // override the computeArea function to calculate the area of a rectangle

    public double computeArea() {
        return dimension1 * dimension2;
    }
}

public class chit4 {

    public static void main(String[] args) {
        // create a Triangle object and input the dimensions
        Triangle triangle = new Triangle();
        triangle.inputDimensions(3, 4);

        // calculate and print the area of the triangle
        System.out.println("Area of Triangle: " + triangle.computeArea());

        // create a Rectangle object and input the dimensions
        Rectangle rectangle = new Rectangle();
        rectangle.inputDimensions(5, 6);

        // calculate and print the area of the rectangle
        System.out.println("Area of Rectangle: " + rectangle.computeArea());
    }
}