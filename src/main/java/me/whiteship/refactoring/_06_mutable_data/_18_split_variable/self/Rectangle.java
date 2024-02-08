package me.whiteship.refactoring._06_mutable_data._18_split_variable.self;

public class Rectangle {

    private double perimeter;
    private double area;

    public void updateGeometry(double height, double width) {
        setPerimeter(2 * (height + width));
        System.out.println("Perimeter: " + getPerimeter());

        setArea(height * width);
        System.out.println("Area: " + getArea());
    }

    public double getPerimeter() {
        return perimeter;
    }

    public double getArea() {
        return area;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public void setArea(double area) {
        this.area = area;
    }
}
