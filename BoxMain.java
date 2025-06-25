// File: Box.java

class Box {
    private double width;
    private double height;

    public Box() {
        width = 0;
        height = 0;
    }

    public Box(double w, double h) {
        width = w;
        height = h;
    }

    public void display() {
        System.out.println("Width: " + width + ", Height: " + height);
    }
}

public class BoxMain {
    public static void main(String[] args) {
        Box b1 = new Box();
        Box b2 = new Box(3.4, 5.2);
        b1.display();
        b2.display();
    }
}
