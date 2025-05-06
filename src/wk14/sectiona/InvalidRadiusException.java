package wk14.sectiona;

public class InvalidRadiusException extends RuntimeException {
    //why no super()?
    public InvalidRadiusException(String msg){
        super(msg);
    }
}
