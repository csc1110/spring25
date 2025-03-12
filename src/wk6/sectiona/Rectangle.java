package wk6.sectiona;

public class Rectangle {
    private final int width;
    private final int height;
    public Rectangle(){
        this(0,0);
    }
    public Rectangle(int side) {
        this(side, side);
    }

    public Rectangle(int width, int height){
        if(width <= 0){
            this.width = 1;
        } else {
            this.width = width;
        }
        if(height <= 0){
            this.height = 1;
        } else {
            this.height = height;
        }
    }
//    public Rectangle(int side){
//        this(side, side);
//
//        //        if(side <= 0){
////            width = 1;
////            height = 1;
////        } else{
////            width = side;
////            width = side;
////        }
//    }


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
}
