package wk11.sectionb;

import java.io.CharArrayReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Armor implements Sellable {
    String material;

    public Armor(String material) {
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }
    public void display(){
        System.out.println("Armor made of "+material+", Price "+price());
    }
    public double price(){
        return switch (material) {
            case "leather" -> 5;
            case "wood" -> 1;
            case "iron" -> 10;
            default -> 0;
        };
    }
}
