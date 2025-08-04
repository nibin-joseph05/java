import java.util.Scanner;

class Factorial{
     public static void main(String[] args){
             Scanner sc = new Scanner(System.in);
             System.out.print("enter a number : ");
             int number = sc.nextInt();

             int fact = 1;

             if(number >=1 ){
                    for(int i = 1; i <= number;i++){
                          
                          fact *= i;
                    }
             }

             System.out.println(fact);
     }
}