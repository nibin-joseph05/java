import java.util.Scanner;
import java.util.InputMismatchException;


class StudentMain{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int rollno = 0;
        double score;
        char division;
        String address;

        while(true){
            try{
                System.out.println("Enter the rollno: " );
                rollno = scanner.nextInt();
                
                

            }
            catch(InputMismatchException e){
                System.out.println("Invalid input");
            }
            break;
        }

        System.out.println(rollno);
        
    }
}