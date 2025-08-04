abstract class Appliance {
    private int powerRating;

    public Appliance(int powerRating) {
        this.powerRating = powerRating;
    }

    public int getPowerRating() { return powerRating; }
    public void setPowerRating(int powerRating) {
        this.powerRating = powerRating;
    }

    public abstract void turnOn();
    public abstract void turnOff();
}

class Fan extends Appliance {
    public Fan(int powerRating) {
        super(powerRating);
    }

    public void turnOn() {
        System.out.println("Fan is now ON");
    }

    public void turnOff() {
        System.out.println("Fan is now OFF");
    }
}

class Light extends Appliance {
    public Light(int powerRating) {
        super(powerRating);
    }

    public void turnOn() {
        System.out.println("Light is now ON");
    }

    public void turnOff() {
        System.out.println("Light is now OFF");
    }
}

class AC extends Appliance {
    public AC(int powerRating) {
        super(powerRating);
    }

    public void turnOn() {
        System.out.println("AC is now ON");
    }

    public void turnOff() {
        System.out.println("AC is now OFF");
    }
}

public class SmartHome {
    public static void main(String[] args) {
        Fan fan = new Fan(75);
        Light light = new Light(60);
        AC ac = new AC(2000);

        fan.turnOn();
        System.out.println("Fan Power: " + fan.getPowerRating() + "W");
        fan.turnOff();

        light.turnOn();
        System.out.println("Light Power: " + light.getPowerRating() + "W");
        light.turnOff();

        ac.turnOn();
        System.out.println("AC Power: " + ac.getPowerRating() + "W");
        ac.turnOff();
    }
}
