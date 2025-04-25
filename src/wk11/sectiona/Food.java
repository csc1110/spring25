package wk11.sectiona;

public class Food implements Sellable {
    private int calories;
    public Food(int calories) {
        this.calories = calories;
    }
    public int getCalories() {
        return calories;
    }
    public void display(){
        System.out.println("Food calories "+calories+", Price "+price());
    }
    public double price(){
        return calories / 500.0;
    }
}
