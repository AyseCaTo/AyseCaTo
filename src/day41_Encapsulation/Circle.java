package day41_Encapsulation;

public class Circle {

    private double radius, diameter, area, circumference;
    private final static double PI;

    static {
        PI = Math.PI;
    }

    public Circle(double radius) {
        this.radius = radius;
        diameter = 2*radius;
        area = calculateArea();
        circumference = calculateCircumference();
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return area;
    }

    public double getDiameter(){
        return diameter;
    }

    public double getCircumference(){
        return circumference;
    }

    private double calculateArea(){
        area = PI*Math.pow(radius,2);
        return area;
    }

    private double calculateCircumference(){
        circumference = PI*diameter;
        return circumference;
    }

    public void setRadius(double radius) {
        this.radius = radius;
        diameter = 2*radius;
        area = calculateArea();
        circumference = calculateCircumference();

    }
}
