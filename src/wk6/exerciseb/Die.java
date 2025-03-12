package wk6.exerciseb;

public class Die {
    public static final int DEFAULT_NUM_SIDES = 6;
    private static int numSides;
    private int currentValue;
    public Die(){
        this(DEFAULT_NUM_SIDES);
    }
    public Die(int numSides){
        this.numSides = numSides;
        //placeholder
        currentValue = roll();
    }
    public int getCurrentValue(){
        return currentValue;
    }
    public int roll(){
        int r = (int)(Math.random() * numSides + 1);
        currentValue = r;
        return r;
    }
}
