package wk12.seciona;

public class Apple implements Fruit {
    private int numSeeds;
    private double volume;

    public Apple(int numSeeds, double volume) {
        this.numSeeds = numSeeds;
        this.volume = volume;
    }
    public void removeSeeds(){
        numSeeds = 0;
    }
    /**
     * Checks if the fruit is ready to be juiced
     *
     * @return If the fruit is ready
     */
    @Override
    public boolean isPrepped() {
        return false;
    }

    /**
     * Displays the attributes of the Fruit;
     */
    @Override
    public void display() {

    }

    /**
     * Gets the juice of the Fruit, but first
     * checks if the fruit is prepepd.
     *
     * @return Volume of juice.
     */
    @Override
    public double getJuice() {
        return 0;
    }
}
