import java.util.Scanner;

class OddOrEven{
   public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
        
          System.out.print("Enter a number : ");
          int number = sc.nextInt();

          if(number != 0){
               if(number % 2 == 0){
                   System.out.println("The number is even!");
                }
                else{
                    System.out.println("The number is odd!");
            
                 }
                
          }
          else{
              System.out.println("The number cant be zero!");  
}
           sc.close();       
}
}