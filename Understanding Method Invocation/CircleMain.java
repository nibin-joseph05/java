class Circle{
    double radius;

    public double calculateArea(){
        return Math.PI * radius * radius;
    }

}
class CircleMain{
    public static void main(String[] args){
        Circle c = new Circle();
        c.radius = 2;
        double result = c.calculateArea();
        System.out.printf("The area is : %.2f", result);
    }
    
}