package wk11.sectiona;

import java.util.ArrayList;
import java.util.Random;

public class StoreFront2 {
    private static Random random = new Random();
    private static Sellable makeSellabe(){
        int numTypes = 3;
        int r = random.nextInt(numTypes);
        if(r == 0){
            String[] types = {"healing", "poison", "sleep"};
            String t = types[random.nextInt(types.length)];
            return new Potion(t);
        } else if(r == 1){
            return new Weapons(random.nextInt(1, 15));
        }else {
            return new Food(random.nextInt(500, 2000));
        }
    }
    public static void main(String[] args) {
        ArrayList<Sellable> sellables = new ArrayList<>();
        for(int i = 0; i<15; i++){
            sellables.add(makeSellabe());
        }
        System.out.println("Items to buy:");
        for(Sellable s:sellables){
            s.display();
        }
        double income = 0;
        income += sellSellables(sellables);
        System.out.println("Income is "+income);
    }
    private static double sellSellables(ArrayList<Sellable> items){
        int ret = 0;
        double discount = 0.9;
        for(Sellable s:items){
            //ret += Sellable.applyDiscount(s.price());
            ret += Sellable.DISCOUNT_PERCENT * s.price();
        }
        return ret;
    }

}
