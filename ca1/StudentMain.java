import java.util.Scanner;

class Student{
     String name;
     int marks;
     public Student(String name){
          this.name = name;
          marks = 0;
     }

     public Student(String name, int marks){
          this.name = name;
          this.marks = marks;
     }

      public char calculateGrade(){
          if(marks >= 90){
               return 'A';
          }
          else if(marks >= 75 && marks < 90){
               return 'B';
          }
          else if(marks >= 60 && marks < 75){
               return 'C';
          }
          else if(marks >= 40 && marks < 60){
               return 'D';
          }
          else if(marks < 40){
               return 'F';
          }
          else{
             System.out.println("Invalid marks!");
             return 0;
          }


      }

      public void displayDetails(){
           System.out.println("the name is : " + name + " the mark is : " + marks);
      }
  
}



class StudentMain{
         public static void main(String[] args){
             Scanner sc = new Scanner(System.in);
             System.out.print("How many students : ");
             int studentNumber = sc.nextInt();
             sc.nextLine();
             
             Student[] students = new Student[studentNumber];

             for(int i = 0;i < studentNumber ; i++){
                 System.out.print("enter the name : ");
                 String name = sc.nextLine();

                 System.out.print("Enter the marks : ");
                 int marks = sc.nextInt();
                 sc.nextLine();

                 students[i] = new Student(name, marks);
             }
             
             for(int i = 0; i < studentNumber;i++){
                 students[i].displayDetails();
             }
               
         }
 
}