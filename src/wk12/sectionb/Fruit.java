package wk12.sectionb;

public interface Fruit {
    //What type of attribute/variable add?
    /**
     * Conversion from volume to juice
     */
    double VOLUME_TO_JUICE = 0.65;
    public final static int MAX_VOLUME = 10;
    public final static int MIN_VOLUME = 5;

    //What type of methods
    //abstract methods

    /**
     * Checks if the fruit is ready to juice
     * @return true if ready
     */
    boolean isPrepped();
    /**
     * returns the juice of the fruit
     * @return juice in volumes
     */
    double getJuice();

    /**
     * prints out info for the fruit.
     */
    void display();

    /**
     * Returns the amount juice based o nthe volume
     * @param volume of the fruit
     * @return juice amount
     */
    static double juice(double volume){
        return volume * Fruit.VOLUME_TO_JUICE;
    }

}
