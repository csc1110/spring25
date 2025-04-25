package wk11.sectiona;

import java.util.ArrayList;

public class SellableDriver {
    public static void main(String[] args) {
        Sellable s1;
        Sellable s2;
        //s1 = new Sellable();

        Potion p1 = new Potion("healing");
        Food f1 = new Food(600);
        s1 = p1;
        s2 = f1;

        ArrayList<Potion> potions = new ArrayList<>();
        //potions.add(f1);
        ArrayList<Sellable> sellables = new ArrayList<>();
        sellables.add(f1);
        sellables.add(p1);
        for(int i = 0; i<sellables.size(); i++){
            sellables.get(i).display();
            System.out.println(sellables.get(i).price());
//            if(i == 0){
//                System.out.println(sellables.get(0).getCalories());
//            } else if(i == 1){
//                System.out.println(sellables.get(1).getType());
//            }
        }


        s1.display();
        p1.display();
        System.out.println(s1);
        System.out.println(p1);


    }
}
