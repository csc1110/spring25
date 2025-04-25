package wk11.sectiona;

public interface Sellable {
    public static final double DISCOUNT_PERCENT = 0.9;

    public abstract void display();
    public abstract double price();

    public static double applyDiscount(double origPrice){
        return origPrice * 0.9;
    }

}
