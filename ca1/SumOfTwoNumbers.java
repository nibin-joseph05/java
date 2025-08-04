import java.util.Scanner;

class SumOfTwoNumbers{

     public static void main(String[] args){

         Scanner sc = new Scanner(System.in);

         int num1;
         int num2;

         System.out.print("Enter the first number : ");
         num1 = sc.nextInt();
           
         System.out.print("Enter the second number : ");
         num2 = sc.nextInt();

         double sum = num1 + num2;

         System.out.println("The sum is : " + sum);



         sc.close();

}
}