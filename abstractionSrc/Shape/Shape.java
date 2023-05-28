// java program to illustrate the concept of Abstraction

abstract class Shape {
    String color;

    // the are abstract methods
    abstract double area();
    public abstract String toString();

    //abstract class can have the constructor
    public Shape(String color)
    {
        System.out.println("Shape constructor called.");
        this.color = color;
    }

    // this is a concrete method
    public String getColor() {
        return color;
    }
}

class Circle extends Shape{
    double radius;

    public Circle(String color, double radius)
    {
        //calling Shape constructor
        super(color);
        System.out.println("Circle constructor called");
        this.radius = radius;
    }

    @Override double area()
    {
        return Math.PI * Math.pow(radius, 2);
    } 

    @Override public String toString()
    {
        return "Circle color is " + super.getColor()
            + "and area is : " + area();
    }
}

class Rectangle extends Shape {
    double length;
    double width;

    public Rectangle(String color, double length, double width)
    {
        super(color);
        System.out.println("Rectangle constructor called");
        this.length = length;
        this.width = width;
    }

    @Override double area() { return length * width; }

    @Override public String toString(){
        return "Rectangle color is " + super.getColor()
            + "and area is : " + area();
    }
}


class Triangle extends Shape {
    double base;
    double height;

    public Triangle(String color, double base, double height){
        super(color);
        System.out.println("Triangle constructor called.");
        this.base = base;
        this.height = height;
    }

    @Override double area(){
        return base * height / 2;
    }
    
    @Override public String toString(){
        return "This Triangle has color " + super.getColor()
               + " and area " + area();


    }
}
