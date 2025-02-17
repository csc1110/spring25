package wk4.sectiona;

public class Rectangle {
    private int width; //0
    private int height;
    private String color;
    private Point upperLeft;

//    public void temp(int value){
//        int width = 42;
//        System.out.println(this.width);
//        System.out.println(width);
//    }

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

    public void setUpperLeft(Point upperLeft){
        this.upperLeft = upperLeft;
    }
    public void setUpperLeft(int x, int y){
        upperLeft = new Point();
        upperLeft.setX(x);
        upperLeft.setY(y);
    }
    public String getColor() {
        return color;
    }
    public void setColor(String c){
        color = c;
    }

    public void printValues(){
        System.out.println("Rectangle{"+width+","+height+"}");
    }
    public double area(){
        double a = height * width;
        return a;
    }
    public void setValues(int side){
        setValues(side, side);
    }
    public void setValues(int width, int height){
        if(width <= 0){
            System.out.println("Bad side, needs to be positive");
            this.width = 0;
        } else {
            this.width = width;
        }
        if(height <= 0){
            System.out.println("Bad side, needs to be positive");
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    public boolean biggerThan(Rectangle that){
        double thatArea = that.area();
        double thisArea = this.area();
        return thisArea > thatArea;
    }
}
