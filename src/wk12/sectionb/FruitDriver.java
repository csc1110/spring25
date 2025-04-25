package wk12.sectionb;

import javax.management.MBeanNotificationInfo;
import java.util.ArrayList;
import java.util.Random;

public class FruitDriver {
    public static void main(String[] args) {
        Fruit f1;
        //f1 = new Fruit();
        Banana b1 = new Banana(10);
        f1 = b1;
        Fruit f2 = new Apple(4, 10);

        Random random = new Random();
        ArrayList<Fruit> fruits = new ArrayList<>();
        fruits.add(b1);
        fruits.add(new Apple(3, 10));
        fruits.add(new Banana(random.nextInt(Fruit.MIN_VOLUME,
                Fruit.MAX_VOLUME)));

        for(Fruit f: fruits){
            f.display();
            if(!f.isPrepped()){
                if(f instanceof Apple){
                    ((Apple)f).removeSeeds();
                } else if (f instanceof Banana) {
                    ((Banana)f).peel();
                }
            }
            System.out.println(f.getJuice());
        }
        Fruit f3 = new Banana(10);
        Banana newBanana = (Banana)f3;
        newBanana.peel();

        //Apple newApple = (Apple)f3;
    }
}
