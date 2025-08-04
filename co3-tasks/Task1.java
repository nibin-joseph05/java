class Animal{
    public void makeSound(){
        System.out.println("Animal Sound");
    }
}

class Dog extends Animal{
    public void makeSound(){
        System.out.println("Bow Bow Shonu");
    }
}

class Cat extends Animal{
    public void makeSound(){
        System.out.println("meow meow Shonu");
    }
}

class Cow extends Animal{
    public void makeSound(){
        System.out.println("moo moo Shonu");
    }
}

class Task1{
    public static void main(String[] args){
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal cow = new Cow();

        dog.makeSound();
        cat.makeSound();
        cow.makeSound();
    }
}
