package wk11.sectionb;

import java.util.ArrayList;

public class SellableDriver {
    public static void main(String[] args) {
        Sellable s1;
        Sellable s2;
        Weapon w1 = new Weapon(13);
        s1 = w1;
        Food f1 = new Food(600);
        s2 = f1;

        ArrayList<Weapon> weapons = new ArrayList<>();
        weapons.add(w1);
        //weapons.add(f1);

        ArrayList<Sellable> sellables = new ArrayList<>();
        sellables.add(w1);
        sellables.add(f1);

        for(Sellable s:sellables){
            s.display();
            System.out.println(s.price());
            //System.out.println(s.getDmg());
            //System.out.println(s.getCalories());
        }





        String word;
        //word = w1;
    }
}
