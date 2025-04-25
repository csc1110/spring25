package wk11.sectiona;

import java.util.ArrayList;
import java.util.Random;

public class StoreFront {
    private static Random random = new Random();
    private static Potion makePotion(){
        String[] types = {"healing", "poison", "sleep"};
        String t = types[random.nextInt(3)];
        return new Potion(t);
    }
    private static Food makeFood(){
        return new Food(random.nextInt(500, 2000));
    }
    public static void main(String[] args) {
        ArrayList<Potion> potions = new ArrayList<>();
        ArrayList<Food> foods = new ArrayList<>();
        ArrayList<Weapons> weapons = new ArrayList<>();

        for(int i = 0; i<10; i++){
            potions.add(makePotion());
        }
        for(int i = 0; i < 5; i++){
            foods.add(makeFood());
        }
//        for(int i = 0; i < 5; i++){
//            weapons.add(makeWeapon());
//        }
        System.out.println("Items to buy:");
        for(Potion p: potions){
            p.display();
        }
        for(Food f: foods){
            f.display();
        }
        double income = 0;
        double discount = 0.9;
        income += sellPoints(potions);
        income += sellFood(foods);
        System.out.println("Income is "+income);
    }
    private static double sellPoints(ArrayList<Potion> items){
        int ret = 0;
        for(Potion p:items){
            ret += p.price();
        }
        return ret;
    }
    private static double sellFood(ArrayList<Food> items){
        int ret = 0;
        for(Food f:items){
            ret += f.price();
        }
        return ret;
    }
}
