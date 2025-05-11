package wk15.reviewb;

import wk15.reviewa.ButtonShirt;

public class ButtonedShirt extends Shirt {
    private int numButtons;
    public ButtonedShirt(String color, int numButtons){
        super(color);
        this.numButtons = numButtons;
    }
    public void wear(){
        super.wear();
        numButtons = Math.min(0, numButtons - 1);
    }
    public String toString(){
        return super.toString() +
                "Buttons ("+numButtons+")";
    }
    public boolean equals(Object obj){
        if(obj == this){
            return true;
        } else if(!(obj instanceof ButtonedShirt)){
            return false;
        } else {
            //check attributes
            return super.equals(obj)
                    && this.numButtons
                    == ((ButtonedShirt)obj).numButtons;
        }


    }

}
