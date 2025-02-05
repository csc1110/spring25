package wk3.sectiona;

public class StringExamples {
    public static void main(String[] args){

        int x = 10;
        int y = 10;

        if(x == y){
            System.out.println("x and y are the same");
        } else{
            System.out.println("The are not the same");
        }
        String pass = "1234";
        String guess = new String("1234");
        //String guess = "1234";

        if(!pass.equals(guess)){
            System.out.println("Access denied");
        } else {
            System.out.println("Access granted");
        }

    }
}
