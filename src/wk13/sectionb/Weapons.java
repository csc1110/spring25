package wk13.sectionb;

public class Weapons implements Sellable {
    private int dmg;
    public Weapons(int dmg) {
        this.dmg = dmg;
    }
    public int getDmg() {
        return dmg;
    }
    public double price(){
        return dmg * 1.5;
    }
    public void display(){
        System.out.println("Weapon with dmg "+dmg+
                ", Price "+price());
    }
}
