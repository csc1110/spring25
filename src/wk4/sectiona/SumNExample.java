package wk4.sectiona;

public class SumNExample {
    public static void main(String[] args) {
        int n = 5;
        int ans = 0;
        for(int i = n;i >= 1;i--){
            ans += i;
        }
        System.out.println("answer is "+ans);
    }
}
