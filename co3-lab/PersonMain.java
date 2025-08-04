abstract class Person{
    private String name;
    private int id;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return id;
    }

    public abstract String getRole();
    public abstract void setRole(String name);
}
class Student extends Person{
    private String role;
    public void setRole(String role){
        this.role = role;
    }
    public String getRole(){
        return role;
    }

}
class Professor extends Person{
    private String role;
    public void setRole(String role){
        this.role = role;
    }
    public String getRole(){
        return role;
    }
}

public class PersonMain{
    public static void main(String[] args){
        Person ps = new Student();
        ps.setName("Nibin");
        ps.setId(1);
        ps.setRole("student");
        Person pp = new Professor();
        pp.setName("abin");
        pp.setId(2);
        pp.setRole("professor");

        System.out.println("The student name is  " + ps.getName() + " the id is " + ps.getId() + " the role is " + ps.getRole());
        System.out.println("The professor name is  " + pp.getName() + " the id is " + pp.getId() + " the role is " + pp.getRole());


    }
}