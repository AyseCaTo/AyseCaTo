package day44_Inheritance.ShapesTask;

public class Cube extends Shape {

    public double side;

    public Cube(double side) {
        super("Cube");
        this.side = side;
    }

    @Override
    public double calculatePerimeter() {
        return side*12;
    }

    @Override
    public double calculateArea() {
        return new Square(side).calculateArea()*6;
    }
}
