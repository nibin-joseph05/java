import java.util.Scanner;

class PrimeOrNot{
     public static void main(String[] args){
           Scanner sc = new Scanner(System.in);
           System.out.print("Enter a number : ");
           int number = sc.nextInt();

           boolean isPrime = true;

           if(number > 1){
               for(int i = 2;i < number ; i++){
                     if(number % i == 0){
                           isPrime = false;
                           break;
                      }
                    
                     
               }
           }
           else{
               System.out.println("Invalid number!");
           }

           if(isPrime){
                System.out.println("its prime ");
           }

           else{
                System.out.println("its not prime ");

           }
     }
}