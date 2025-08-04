import java.util.Scanner;

class SumOfDigits{
        public static void main(String[] args){
                 Scanner sc = new Scanner(System.in);
                 System.out.print("enetr a number : ");
                 int number = sc.nextInt();

                 int sum = 0;

                  if(number > 0){
                        while (number != 0){
                              int lastDigit = number % 10;
                              number /= 10;
                              sum += lastDigit;

                              
                        }
                  }
                  System.out.println("the sum of  number is : " + sum);
        }
}