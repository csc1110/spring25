package wk15.reviewa;

public class Shirt {
    private boolean clean;
    private String color;

    public Shirt(String color){
        this.color = color;
        clean = true;
    }
    public void clean(){
        clean = true;
    }
    public void wear(){
        clean = false;
    }
    public String toString(){
        return "Shirt: clean("+clean+")";
    }
    @Override
    public boolean equals(Object obj){
        if(obj == this){
            return true;
        } else if(!(obj instanceof Shirt)){
            return false;
        } else {
            Shirt s = (Shirt)obj;
            return s.color.equals(this.color);
        }
        //check attributes
        //check if both are the same color
    }
}
