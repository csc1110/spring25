package wk12.sectionb;

public class Banana implements Fruit {
    private boolean isPeeled;
    private double volume;

    public Banana(double volume) {
        this.isPeeled = false;
        this.volume = volume;
    }
    public void peel(){

    }

    @Override
    public double getJuice(){
        return 0;
    }

    @Override
    public void display(){

    }

    @Override
    public boolean isPrepped(){
        return false;
    }


}
