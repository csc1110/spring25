package wk11.sectiona;

public class Potion implements Sellable {
    private String type;

    public Potion(String type){
        this.type = type;
    }
    public String getType() {
        return type;
    }
    public void display(){
        System.out.println("Potion "+type + ", Price "+price());
    }
    public double price(){
        return switch (type) {
            case "healing" -> 20;
            case "poison" -> 5;
            case "sleep" -> 15;
            default -> 0;
        };
    }

}
