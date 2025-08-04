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
        r.color = "red";
        c.displayColor();
        r.displayColor();
    }
}