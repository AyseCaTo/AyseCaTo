package day44_Inheritance.ShapesTask;

public class Circle extends Shape{

    public double radius, diameter;
    public final static double PI;

    static{
        PI = 3.14;
    }

    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
        diameter = 2*radius;
    }

    public double calculatePerimeter(){
        return PI*diameter;

    }

    public double calculateArea(){
        return PI*Math.pow(radius,2);

    }



    
}
