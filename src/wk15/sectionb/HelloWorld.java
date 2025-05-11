package wk15.sectionb;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello world.");
        System.out.println("Length of args "+args.length);
        for(int i = 0; i<args.length; i++){
            System.out.println(args[i]);
        }
        if(args[0].equals("foo")){
            System.out.println("bar");
        } else if(args[0].equals("taco")){
            System.out.println("cat");
        } else {
            System.out.println("World");
        }
    }
}
