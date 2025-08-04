import java.util.Scanner;

class MultiplicationTable{
     public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int number;
            System.out.print("Enter a number : ");
            number = sc.nextInt();
            for(int i = 1; i <= 10;i++){
                System.out.println(number + " * " + i + " = " + (number * i)); 
            }
            sc.close();
  }
}