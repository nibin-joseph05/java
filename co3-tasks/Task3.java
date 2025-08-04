class Employee{
    protected String name = "Alice";
    protected double salary = 900000;
}

class Manager extends Employee{
    Manager(){
        System.out.println("Manager Name : " + name);
        System.out.println("Salary : " + salary);
    }
}

class Task3{
    public static void main(String[] args){
        Manager manager = new Manager();
    }
}