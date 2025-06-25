import java.util.Scanner;

class SumOfTwoNumbers{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double number1;
        double number2;

        System.out.print("Enter the first number : ");
        number1 = scanner.nextDouble();

        System.out.print("Enter the second number : ");
        number2 = scanner.nextDouble();

        double result = number1 + number2;

        System.out.println("The sum is " + result);

        scanner.close();
        
    }
}