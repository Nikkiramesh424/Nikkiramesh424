import java.util.*;
abstract class Shape
{
    abstract double area();
}
class Circle extends Shape
{
    double radius;
    Circle(double r)
    {
        radius=r;
    }
    double area()
    {
        return  3.14*radius*radius;
    }
}
class Rectangle extends Shape
{
    double l,b;
    Rectangle(double length,double breadth)
    {
        l=length;
        b=breadth;
    }
    double area()
    {
        return l*b;
    }
}
class Square extends Shape
{
    int s;
    Square(int side)
    {
        s=side;
    }
    double area()
    {
        return s*s;
    }
}
public class Abarea
{
    public static void main(String args[])
    {
       Shape obj=new Circle(3.2);
       Shape ob=new Rectangle(3,2);
       Shape obje=new Square(3);
       System.out.println("area of circle:"+obj.area());
       System.out.println("area of rectangle:"+ob.area());
       System.out.println("area of square:"+obje.area());
    }
}
