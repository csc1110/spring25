package wk11.sectionb;

import java.util.ArrayList;
import java.util.Random;

public class StoreFront2 {
    private static Random random = new Random();

    private static Sellable makeSellable(){
        final int numItems = 3;
        int r = random.nextInt(3);
        if(r == 0){
            return new Weapon(random.nextInt(1, 20));
        } else if(r == 1){
            String[] types = {"wood", "leather", "iron"};
            return new Armor(types[random.nextInt(2)]);
        } else {
            return new Food(random.nextInt(500, 2000));
        }
    }
    public static void main(String[] args) {
        ArrayList<Sellable> sellables = new ArrayList<>();
        for(int i = 0; i < 15; i++){
            sellables.add(makeSellable());
        }
        System.out.println("All the items");
        for(Sellable s: sellables){
            s.display();
        }
        int income = 0;
        income += sellSellables(sellables);
        System.out.println("Price of all items is "+income);
    }
    private static double sellSellables(ArrayList<Sellable> items){
        int income = 0;
        for(Sellable s: items){
            income += s.price();
        }
        return income;
    }

    private static double sellWeapons(ArrayList<Weapon> items){
        int income = 0;
        for(Weapon w: items){
            income += w.price();
        }
        return income;
    }
    private static double sellFood(ArrayList<Food> items){
        int income = 0;
        for(Food f: items){
            income += f.price();
        }
        return income;
    }
}
