package wk14.sectiona;

public class InvalidRadiusExceptionUnchecked extends RuntimeException {
    //why no super()?
    public InvalidRadiusExceptionUnchecked(String msg){
        super(msg);
    }
}
