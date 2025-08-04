import java.util.Scanner;

class Fibonacci{
     public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
          System.out.print("enter the limit : ");
          int limit = sc.nextInt();
          int num1 = 0;
          int num2 = 1;
          int num3 = 0;

          for(int i = 0;i < limit ;i++){
               System.out.println(num1);
               num3 = num1 + num2;
               num1 = num2;  
               num2 = num3;
               
          }
          

           
     }
}