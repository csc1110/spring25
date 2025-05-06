package wk14.sectiona;

public class InvalidRadiusExceptionChecked extends Exception {
    //why no super()?
    public InvalidRadiusExceptionChecked(String msg){
        super(msg);
    }
}
