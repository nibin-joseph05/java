abstract class Appliance{
    Appliance(){
        System.out.println("Appliance is on.");
    }
}

interface RemoteControl{
    static void display(){
        System.out.println("Remote controlling TV.");
    }
}

class TV extends Appliance implements RemoteControl{

    
}

class Task7{
    public static void main(String[] args){
        Appliance appliance = new TV();
        RemoteControl.display();
    }
}