class Box{
    double width;
    double height;

    public void setDimensions(double a, double b) {
    width = a;
    height = b;
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