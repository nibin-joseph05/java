class Shape{
    public double area(double length, double bredth){
        return length * bredth;
    }
    public double area(double radius){
        return Math.PI * (radius * radius);
    }
    public int area(int side){
        return side * side;
    }
    
}

class ShapeCalculator{
    public static void main(String[] args){
        Shape s = new Shape();

        System.out.println("area of circle  = " + s.area(2.0));
        System.out.println("area of rectangle  = " + s.area(2,3));
        System.out.println("area of sqaure  = " + s.area(2));
        
    }
}