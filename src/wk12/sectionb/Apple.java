package wk12.sectionb;

public class Apple implements Fruit {
    private int numSeeds;
    private double volume;

    public Apple(int numSeeds, double volume) {
        this.numSeeds = numSeeds;
        this.volume = volume;
    }
    public void removeSeeds(){

    }

    /**
     * Checks if the fruit is ready to juice
     *
     * @return true if ready
     */
    @Override
    public boolean isPrepped() {
        return false;
    }

    /**
     * returns the juice of the fruit
     *
     * @return juice in volumes
     */
    @Override
    public double getJuice() {
        return 0;
    }

    /**
     * prints out info for the fruit.
     */
    @Override
    public void display() {

    }
}
