import java.util.Scanner;

class Calculator{

    static double addition(double a, double b){
        double sum = a + b;
        return sum;
    }

    static double subtraction(double a, double b){
        double value = a - b;
        return value;
    }

    static double multiplication(double a, double b){
        double value = a * b;
        return value;
    }

    static double division(double a, double b){

        if ( b != 0){
            double value = a / b;
            return value;
        }
        else{
            System.out.println("Cant be Zero");
            return 0;
        }
        
    }

    public static void main(String[] a){
        Scanner scanner = new Scanner(System.in);

        double num1;
        double num2;
        int choice;

        System.out.print("Enter the First Number : ");
        num1 = scanner.nextDouble();

        System.out.print("Enter the Second Number : ");
        num2 = scanner.nextDouble();
        
        System.out.print("Enter the Operation You want to perform : \n 1. Addition \n 2. subtraction \n 3. Multiplication \n 4. Division \n 5. Modulus \n");
        choice = scanner.nextInt();

        switch(choice){
            case 1 -> System.out.println("The sum is : " + addition(num1, num2));
            case 2 -> System.out.println("The value is : " + subtraction(num1, num2));
            case 3 -> System.out.println("The value is : " + multiplication(num1, num2));
            case 4 -> System.out.println("The value is : " + division(num1, num2));
            case 5 -> System.out.println("The value is : " + subtraction(num1, num2));

        }






        scanner.close();
    }
}