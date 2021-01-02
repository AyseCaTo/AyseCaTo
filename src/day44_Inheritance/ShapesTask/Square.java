package day44_Inheritance.ShapesTask;

public class Square extends Shape{

    public double side;

    public Square(double side) {
        super("Square");
        this.side = side;
    }

    public double calculatePerimeter(){
        return 4*side;

    }

    public double calculateArea(){
        return side*side;

    }
}
