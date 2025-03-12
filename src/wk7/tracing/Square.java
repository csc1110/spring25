/*
 * Course:
 * Term
 * Assignment Name
 * Name:
 * Created: 9/25/2023
 */
package wk7.tracing;

public class Square {
    private int side;
    private String id;
    public void setSide(int side){
        this.side = side;
    }
    public void setID(String id){
        this.id = id;
    }
    public void disp(){
        System.out.println("Square "+id+" width side "+side);
    }
    public double area(){
        double ret = this.side * this.side;
        return ret;
    }
    public boolean smallerThan(Square that){
        double thisArea = this.area();
        double thatArea = that.area();
        boolean ret = thisArea < thatArea;
        return ret;
    }
}
