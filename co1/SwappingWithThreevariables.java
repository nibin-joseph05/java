import java.util.Scanner;

class SwappingWithThreevariables{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double number1;
        double number2;
        double temp;

        System.out.print("Enter the first number : ");
        number1 = scanner.nextDouble();

        System.out.print("Enter the second number : ");
        number2 = scanner.nextDouble();

        System.out.println("before swapping: number1 = " + number1 + " number2 = " + number2 );

        temp = number1;
        number1 = number2;
        number2 = temp;

        System.out.println("after swapping: number1 = " + number1 + " number2 = " + number2);



        scanner.close();



    }
}