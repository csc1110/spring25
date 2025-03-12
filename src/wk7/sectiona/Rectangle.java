package wk7.sectiona;

public class Rectangle {
    private int width;
    private int height;
    private final String id;

    public Rectangle(int width, int height, String id) {
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
        this.id = id;
    }
    public Rectangle(int side, String id) {
        this(side, side, id);
    }
    public Rectangle(){
        this(0, 0, null);
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getId() {
        return id;
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
        System.out.println("Rectangle: "+width+","+height+":"+id);
    }

    public  boolean equals(Rectangle other){
        return this.getWidth() == other.getWidth() &&
                this.getHeight() == other.getHeight() &&
                this.getId().equals(this.getId());
    }
}
