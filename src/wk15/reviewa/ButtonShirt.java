package wk15.reviewa;

public class ButtonShirt extends Shirt {
    private int numButtons;
    public ButtonShirt(String color,
                       int numButtons){
        super(color);
        this.numButtons = numButtons;
    }

    public void wear(){
        super.wear();
        numButtons = Math.min(0, numButtons - 1);
    }
    public String toString(){
        return super.toString() +"Buttons("+numButtons+")";
    }
    public boolean equals(Object object){
        if(super.equals(object)){
            if(object instanceof ButtonShirt){
                return this.numButtons ==
                        ((ButtonShirt) object).numButtons;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

}
