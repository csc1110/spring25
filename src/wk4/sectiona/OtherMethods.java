package wk4.sectiona;

public class OtherMethods {
    public static void main(String[] args) {
        Integer value = 42;

        System.out.println(value * 2);

        System.out.println(Math.abs(-2));
        System.out.println(Integer.parseInt("42"));
        System.out.println(Double.parseDouble("42"));

        System.out.println(Character.isDigit('2'));
        System.out.println(Character.isLetter('!'));
        System.out.println(Character.isSpaceChar(' '));
        System.out.println(Character.isLowerCase(' '));
        System.out.println(Character.isUpperCase(' '));

        char ans = 'q';
        String exit = "q";

        boolean isSame = exit.equals((String.valueOf(ans)));

        String word1 = "";
        String word2 = "tacocat";

        System.out.println("Word is empty "+word1.isEmpty());
        System.out.println("Word is empty "+word2.isEmpty());

        System.out.println("Index of letter a "+word2.indexOf("a"));
        System.out.println("Index of letter a "+word2.lastIndexOf("a"));

        System.out.println(word2.replace("a", "*"));
        System.out.println(word2.contains("a"));






    }
}
