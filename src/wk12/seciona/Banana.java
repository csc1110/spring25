package wk12.seciona;

public class Banana implements Fruit {
    private boolean isPeeled = false;
    private double volume;

    public Banana(double volume) {
        this.volume = volume;
    }

    public void peel(){

    }
    public boolean isPrepped(){
        return false;
    }

    @Override
    public void display() {

    }

    public double getJuice(){
        return 0;
    }

}
