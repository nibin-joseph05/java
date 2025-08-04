import java.util.Scanner;

abstract class Shape{
    public abstract void draw();
}

class Circle extends Shape{
    public void draw(){
        System.out.println("Drawing Circle");
    }
}

class Square extends Shape{
    public void draw(){
        System.out.println("Drawing square");
    }
}

class Triangle extends Shape{
    public void draw(){
        System.out.println("Drawing Triangle");
    }
}

class Task2{
    public static void main(String[] args){
        Shape a = null;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Shape (circle, square, triangle ) : ");
        String input = sc.next().toLowerCase();

        if(input.equals("square")){
            a = new Square();
        }
        else if(input.equals("circle")){
            a = new Circle();
        }
        else if(input.equals("triangle")){
            a = new Triangle();
        }
        
        a.draw();

        sc.close();
    }
}