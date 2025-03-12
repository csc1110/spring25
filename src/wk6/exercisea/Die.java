package wk6.exercisea;

public class Die {
    public static final int DEFAULT_NUM_SIDES = 6;
    private static int numSides;
    private int currentValue;

    public Die(int numSides){
        this.numSides = numSides;
        roll();
    }
    public int getCurrentValue(){
        return currentValue;
    }
    public int roll(){
         currentValue = (int) (Math.random() * numSides + 1);
         return currentValue;
    }
}
