package wk6.exercisea;

import javax.crypto.spec.PSource;

public class StaticDriver {
    public static void main(String[] args) {
        Die coin = new Die(2);
        System.out.println(coin.roll());

        Die d100 = new Die(100);
        System.out.println(d100.roll());

        System.out.println(coin.roll());

    }


}
