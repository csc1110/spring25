package wk8.sectiona;

public class ArraysIntro {
    public static void main(String[] args) {
        int[] num;
        num = new int[3];

        num[0] = 42;
        num[1] = -9;
        num[2] = num[0] * num[1];

        System.out.println(num.length);
        for(int i = 0; i<num.length; i++){
            System.out.println(num[i]);
        }

        String word = "Hello";
        System.out.println(word.length());
        for(int i = 0; i<word.length(); i++){
            System.out.println(word.charAt(i));
        }


    }
}
