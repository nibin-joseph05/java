interface Hello{
    static void hello(){
        System.out.println("Hello from interface");
    }
    abstract void hai();
}

class Hai implements Hello{
    public void hai(){
        System.out.println("Hai from sub class");
    }
}

class InterfaceExample{
    public static void main(String[] args){
        Hello hai = new Hai();
        Hello.hello();
        hai.hai();
        
    }
}