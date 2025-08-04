final class Animal{
    protected String name  = "Nibin";
}

class Dog extends Animal{
    Dog(){
        System.out.println("name is : " + name);
    }
}

class Task4{
    public static void main(String[] args){
        Dog dog = new Dog();
    }
}