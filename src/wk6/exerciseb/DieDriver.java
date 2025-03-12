package wk6.exerciseb;

public class DieDriver {
    public static void main(String[] args) {
        System.out.println("Enter a die value, " +
                "the default is");
        System.out.println(Die.DEFAULT_NUM_SIDES);

        Die coin = new Die(2);
        System.out.println(coin.roll());

        Die d100 = new Die(100);
        System.out.println(d100.roll());

        System.out.println(coin.roll());
    }
}
