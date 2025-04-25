package wk12.sectionb;

import wk12.seciona.Polygon;
import wk12.seciona.Shape;

public class Rectangle implements wk12.seciona.Shape, Polygon {

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
