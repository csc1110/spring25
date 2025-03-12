package wk6.sectionb;

public class Rectangle {
    private final int width;
    private final int height;

    public Rectangle(int width, int height){
        if(width <= 0){
            this.width = 0;
        } else {
            this.width = width;
        }
        if (height <= 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }
    public Rectangle(int side){
        this(side, side);
//        if(side <= 0){
//            width = 0;
//            height = 0;
//        } else {
//            height = side;
//            width = side;
//        }
    }
//    //default
    public Rectangle(){
        this(0, 0);
        //width = 0;
        //height = 0;
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
        System.out.println("Rectangle: width "+width+",height"+height);
    }
}
