class Car{

    private String model;
    private int year;

    void setDetails(String model, int year){
        this.model = model;
        this.year = year;
    }

    void displayDetails(){
        System.out.println("The model is " + model);
        System.out.println("The year is " + year);
    }

    public static void main(String[] args){

        Car car = new Car();
        
        car.setDetails("toyota", 2025);
        car.displayDetails();
        
    }
}