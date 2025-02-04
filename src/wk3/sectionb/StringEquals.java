package wk3.sectionb;

public class StringEquals {
    public static void main(String[] args){
        int x = 10;
        int y = 10;

        if(x == y){
            System.out.println("X and y are the same");
        } else{
            System.out.println("X and y are diff");
        }

        String pass = "1234";
        String guess = new String("1234");

        if(pass.equals(guess)){
            System.out.println("Access granted");
        } else{
            System.out.println("Access denied");
        }




    }
}
