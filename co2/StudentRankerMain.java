class StudentRanker{

    String studentName;
    double marks;
    char grade;

    public StudentRanker(){}

    public StudentRanker(String studentName, double marks){
        this.studentName = studentName;
        this.marks = marks;
    }
    
    public void calculateGrade(){
        if (marks >= 90){
            grade = 'A';
        }
        else if (marks >= 80){
            grade = 'B';
        }
        else if (marks >= 70){
            grade = 'C';
        }
        else if (marks >= 60){
            grade = 'D';
        }
        else{
            grade = 'F';
            System.out.println("You failed!");
        }

    }

    public void displayGrade(){

        System.out.println("Your name is " + studentName);
        System.out.println("Your grade is " + grade);

    }

}

class StudentRankerMain{
    public static void main(String[] args){

        StudentRanker sr = new StudentRanker("Nibin Joseph", 68);

        sr.calculateGrade();
        sr.displayGrade();
    }
}