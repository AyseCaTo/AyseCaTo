package day44_Inheritance.ShapesTask;

public class Triangle extends Shape{

    public double height, base;

    public Triangle(String name, double height, double base) {
        super(name);
        this.height = height;
        this.base = base;
    }
}
