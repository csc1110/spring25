package wk11.sectionb;

import java.util.ArrayList;
import java.util.Random;

public class StoreFront {
    private static Random random = new Random();
    private static Weapon makeWeapon(){
        return new Weapon(random.nextInt(1, 20));
    }
    private static Food makeFood(){
        return new Food(random.nextInt(500, 2000));
    }
    public static void main(String[] args) {
        ArrayList<Weapon> weapons = new ArrayList<>();
        ArrayList<Food> foods = new ArrayList<>();
        for(int i = 0; i<3; i++){
            weapons.add(makeWeapon());
        }
        for(int i = 0; i<5; i++){
            foods.add(makeFood());
        }
        System.out.println("All the items");
        for(Weapon w:weapons){
            w.display();
        }
        for(Food f:foods){
            f.display();
        }
        int income = 0;
        income += sellWeapons(weapons);
        income += sellFood(foods);
        System.out.println("Price of all items is "+income);
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
