package wk12.seciona;

public class Rectangle implements Shape, Polygon {

    public int numSides(){
        return 4;
    }
    public double area(){
        return 0;
    }
    public boolean isSame(Shape s){
        return false;
    }
}
