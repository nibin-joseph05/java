interface Camera{
    void takePhoto();
}

interface Phone{
    void makeCall();
}

class SmartPhone implements Camera, Phone{
    public void takePhoto(){
        System.out.println("Photo taken.");
    }
    public void makeCall(){
        System.out.println("Calling 123-456-7890.");
    }
}

class Task6{
    public static void main(String[] args){
        SmartPhone sp = new SmartPhone();

        sp.takePhoto();
        sp.makeCall();
    }
}