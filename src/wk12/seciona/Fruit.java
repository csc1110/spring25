package wk12.seciona;

public interface Fruit {
    //What type attributes/variables?
    //static
    //final
    //public
    public static final double VOLUME_TO_JUICE = 0.65;

    //What type of methods?
    //abstract

    /**
     * Checks if the fruit is ready to be juiced
     * @return If the fruit is ready
     */
    boolean isPrepped();

    /**
     * Displays the attributes of the Fruit;
     */
    void display();

    /**
     * Gets the juice of the Fruit, but first
     * checks if the fruit is prepepd.
     * @return Volume of juice.
     */
    double getJuice();

    //static method
    public static double juice(double volume){
        return VOLUME_TO_JUICE * volume;
    }
}
