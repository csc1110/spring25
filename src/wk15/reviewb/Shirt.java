package wk15.reviewb;

public class Shirt {
    private String color;
    private boolean clean;

    public Shirt(String color){
        this.color = color;
        this.clean = true;
    }
    public void wear(){
        clean = false;
    }
    public void clean(){
        clean = true;
    }
    @Override
    public String toString(){
        return color + "Shirt: Clean("+clean+")";
    }

    @Override
    public boolean equals(Object obj){
        if(obj == this){
            return true;
        } else if(!(obj instanceof Shirt)){
            return false;
        } else {
            Shirt s = (Shirt)obj;
            return s.color.equals(this.color)
                    && s.clean == this.clean;
            //attributes check
        }


    }
}
