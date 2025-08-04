class Shape{
    String color;
    public void displayColor(){
        System.out.println("The color of the shape is : " + color);
    }
}
class Circle extends Shape{
    double radius;
    public double calculateArea(){
        return Math.PI * (radius * radius);
    }
}
class Rectangle extends Shape{
    double length;
    double bredth;
    public double calculateArea(){
        return length * bredth;
    }
}
public class ShapeMain{
    public static void main(String[] args){
        Circle c = new Circle();
        Rectangle r = new Rectangle();
        c.color = "blue";
        c.radius = 5;
        r.color = "red";
        r.length = 5;
        r.bredth = 4;
        c.displayColor();
        r.displayColor();
        System.out.println("The area of circle is :" + c.calculateArea());
        System.out.println("The area of rectangle is :" + r.calculateArea());
    }
}