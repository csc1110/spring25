package wk11.sectionb;

public class Food implements Sellable {
    private double calories;

    public Food(double calories) {
        this.calories = calories;
    }

    public double getCalories() {
        return calories;
    }

    public void display(){
        System.out.println("Food calories "
                +calories+", Price "+price());
    }
    public double price(){
        return calories / 100;
    }

}
