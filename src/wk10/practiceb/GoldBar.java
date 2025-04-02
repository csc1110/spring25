package wk10.practiceb;

public class GoldBar {
    private static final double PRICE_PER_POUND = 10;
    private final double weight;

    public GoldBar(double weight){
        this.weight = weight;
    }

    private double calcValue(){
        return weight * PRICE_PER_POUND;
    }
    public String toString(){
        return "Weight "+weight + "value "+calcValue();

    }
}
