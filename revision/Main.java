class Box {
    int width;
    int height;

    Box(){
        width = 0;
        height = 0;
    }
}

public class Main {
    public static void main(String[] args) {
        Box b = new Box();
        b.width = 10;     
        b.height = 20;

        System.out.println("Width: " + b.width);
        System.out.println("Height: " + b.height);
    }
}
