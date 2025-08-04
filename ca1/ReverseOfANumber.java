import java.util.Scanner;

class ReverseOfANumber{
        public static void main(String[] args){
                 Scanner sc = new Scanner(System.in);
                 System.out.print("enetr a number : ");
                 int number = sc.nextInt();
                 
                 int reversed = 0;

                  if(number > 0){
                        while (number != 0){
                              int lastDigit = number % 10;
                              number /= 10;
                              reversed = reversed * 10 + lastDigit;

                              
                        }
                  }
                  System.out.println("the reversed number is : " + reversed);
        }
}