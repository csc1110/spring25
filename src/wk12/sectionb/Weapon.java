package wk12.sectionb;

import wk12.seciona.Sellable;

public class Weapon implements Sellable {
    private int dmg;

    public Weapon(int dmg) {
        this.dmg = dmg;
    }

    public int getDmg(){
        return dmg;
    }

    public void display(){
        System.out.println("Weapon "+dmg +", Price: "+price());
    }
    public double price(){
        return dmg * 1.5;
    }
}
