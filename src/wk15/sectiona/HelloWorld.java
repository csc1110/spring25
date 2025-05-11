package wk15.sectiona;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World.");
        if(args.length > 0){
            System.out.println("Length of args is "+args.length);
            if(args[0].equals("foo")){
                System.out.println("bar");
            } else if(args[0].equals("taco")){
                System.out.println("cat");
            } else {
                System.out.println("Hello");
            }
        } else {
            System.out.println("Length of args is 0");
        }
    }
}
