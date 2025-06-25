import java.util.Scanner;

class AreaAndPerimeterOfRectangle{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double length;
        double bredth;

        System.out.print("Enter the length : ");
        length = scanner.nextDouble();

        System.out.print("Enter the bredth : ");
        bredth = scanner.nextDouble();

        double perimeter = 2 * (length + bredth);

        double area = length * bredth;

        System.out.println("The perimeter is " + perimeter + " and area is " + area);

        scanner.close();
        
    }
}