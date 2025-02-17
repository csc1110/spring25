package wk4.sectionb;

public class SumNExample {
    public static void main(String[] args) {
        int n = 5;
        int sum = 0;

        //out code here
        for(int i = 0; i<=n; i++){
            sum = sum + i;
        }
        sum = 0;
        for(int i = 5;i > 0;i--){
            sum = sum + i;
        }

        System.out.println("The sum is "+sum);
    }

}
