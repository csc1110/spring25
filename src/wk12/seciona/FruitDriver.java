package wk12.seciona;

import java.util.ArrayList;

public class FruitDriver {
    public static void main(String[] args) {

        Fruit f1;
        //f1 = new Fruit();

        Apple a1 = new Apple(4, 10);
        f1 = a1;
        Fruit f2 = new Banana(5);

        ArrayList<Fruit> fruits = new ArrayList<>();
        fruits.add(a1);
        fruits.add(new Banana(7));

        for(Fruit f: fruits){
            f.display();
            if(!f.isPrepped()){
                if(f instanceof Apple){
                    Apple a = ((Apple)f);
                    a.removeSeeds();
                } else if (f instanceof Banana){
                    ((Banana)f).peel();
                }
            }
            System.out.println(f.getJuice());
        }
        Fruit f3 = new Apple(5, 10);
        //fruits.get(0).removeSeeds();
        ((Apple)f3).removeSeeds();
        //((Banana)f3).peel();





    }
}
