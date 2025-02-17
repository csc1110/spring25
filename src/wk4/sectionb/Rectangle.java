package wk4.sectionb;

public class Rectangle {
    private int width;
    private int height;

    private int value = 10;

    public void temp(int value){
        System.out.println(value);
        //int value = 42;
        System.out.println(this.value);
    }
    public int getWidth(){
        return width;
    }
    public int getHeight(){
        return height;
    }
    public void setWidth(int width){
        this.width = width;
    }
    public void setHeight(int height){
        this.height = height;
    }
    public void printValues(){
        System.out.println("Rectangle{"+width+","+height+"}");
    }
    public double area(){
        return width * height;
    }
    public void setSides(int side1, int side2){
        if(side1 <= 0){
            System.out.println("Error side can't be negative");
            width = 10;
        } else {
            width = side1;
        }
        if(side2 <= 0){
            System.out.println("Error side can't be negative");
            height = 10;
        } else {
            height = side2;
        }
    }
    public void setSides(int side){
        setSides(side, side);
//        if(side < 0 ){
//            System.out.println("Error, side can't be negative");
//            width = 10;
//            height = 10;
//        } else {
//            width = side;
//            height = side;
//        }
    }

    /**
     * This method compares the area of the
     * passed in Rectangle to this Rectangle.
     * Returns true if the area of this Rectangle
     * is greater than the area of the passed-in Rectangle.
     * @param that
     * @return
     */
    public boolean biggerThan(Rectangle that){
        double thatArea = that.area();
        double thisArea = this.area();
        System.out.println("That area is "+thatArea);
        System.out.println("This area is "+thisArea);
        return false;
    }

}
