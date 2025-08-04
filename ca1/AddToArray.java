import java.util.Scanner;

class AddToArray{
     public static void main(String[] args){
            Scanner sc = new Scanner(System.in);

            System.out.print("enter the size of array : ");
            int size = sc.nextInt();

            int[] numbers = new int[size];

            System.out.print("enter the numbers : ");

            for(int i = 0; i < size ;i++){
                  numbers[i] = sc.nextInt();
            }
            

            System.out.print("You entered: ");
            for (int n : numbers) {
               System.out.print(n + " ");
            }


            
     }
}