package wk7.sectionb;

public class Rectangle {
    private int width;
    private int height;
    private final String color;

    public Rectangle(int width, int height, String color) {
        if (width <= 0) {
            this.width = 1;
        } else {
            this.width = width;
        }
        if (height <= 0) {
            this.height = 1;
        } else {
            this.height = height;
        }
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public Rectangle(){
        this(0,0, null);
    }
    public Rectangle(int side, String color) {
        this(side, side, color);
    }

    public int getWidth(){
        return width;
    }
    public int getHeight(){
        return height;
    }

//    public void setWidth(int width){
//        this.width = width;
//    }
//    public void setHeight(int height){
//        this.height = height;
//    }

    public void printValues(){
        System.out.println("Rectangle: "+width+","+height);
    }
    /**
     * compares the area of this Rectangle to the passed
     * in Rectangle. Returns true if the area of this
     * Rectangle is less than the area of the passed
     * in other Rectangle.
     * @param other
     * @return
     */
    public boolean smallerThan(Rectangle other){
        double thisArea = getHeight() * getWidth();
        double otherARea = other.getHeight() * other.getWidth();
        return thisArea < otherARea;
        //return false;
    }
}
