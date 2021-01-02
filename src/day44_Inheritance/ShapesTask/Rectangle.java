package day44_Inheritance.ShapesTask;

public class Rectangle extends Shape {

    public double width, length;

    public Rectangle(double width, double length) {
        super("Rectangle");
        this.width = width;
        this.length = length;
    }

    public double calculatePerimeter(){
        return 2*(width+length);

    }

    public double calculateArea(){
        return width*length;

    }
}
