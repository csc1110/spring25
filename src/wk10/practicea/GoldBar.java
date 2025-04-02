package wk10.practicea;

public class GoldBar {
    private final static double PRICE_PER_POUND = 10;
    private final double weight;

    public GoldBar(double weight){
        this.weight = weight;
    }
    private double calcValue(){
        return weight / PRICE_PER_POUND;
    }
    public String toString(){
        return "Weight: "+weight + "\nValue: "+calcValue();
    }
}
