package wk6.exercisea;

import javax.print.attribute.standard.PresentationDirection;

public class DieDriver {
    public static void main(String[] args) {
        Die coin = new Die(2);




    }
    public static String flipCoin(Die coin){
        coin.roll();
        String result;
        if(coin.getCurrentValue() == 1){
            result = "head";
        } else if (coin.getCurrentValue() == 2){
            result = "tail";
        } else {
            result = "error";
        }
        return result;
    }
}
