class Box{
    double width;
    double height;

    public void setDimensions(double a, double b){
        this.a = width;
        this.b = height;
    }

    public void show(){
        System.out.println("width = " + width + "height" + height);
    }
}

class BoxDemo{
    public static void main(String[] args){
        Box b1 = new Box();
        b1.setDimensions(2,3);
        b1.show();
    }

}