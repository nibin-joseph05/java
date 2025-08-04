import java.util.Scanner;

class MaxUsingTernary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1, num2, num3;

        System.out.print("Enter the first number : ");
        num1 = sc.nextInt();

        System.out.print("Enter the second number : ");
        num2 = sc.nextInt();

        System.out.print("Enter the third number : ");
        num3 = sc.nextInt();

        int max = (num1 > num2) ? ((num1 > num3) ? num1 : num3) 
                                : ((num2 > num3) ? num2 : num3);

        System.out.println("The maximum is : " + max);

        sc.close();
    }
}
