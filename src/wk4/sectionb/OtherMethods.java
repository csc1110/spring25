package wk4.sectionb;

public class OtherMethods {
    public static void main(String[] args) {
        int value = 42;

        Integer age = 37;
        System.out.println(2025 - age);

        String num = "42";
        int ans = 2 * Integer.parseInt(num);

        char symbol = 'r';
        System.out.println(Character.isDigit(symbol));
        System.out.println(Character.isLetter(symbol));
        System.out.println(Character.isSpaceChar(symbol));
        System.out.println(Character.isLowerCase(symbol));
        System.out.println(Character.isUpperCase(symbol));

        int num2 = 42;

        String value2 = String.valueOf(num2);

        String word1 = "";
        String word2 = "tacocat";

        System.out.println(word1.isEmpty());
        System.out.println(word2.isEmpty());

        System.out.println("Index of first 'a' "+word2.indexOf("a")); //1
        System.out.println("Index of first 'a' "+word2.lastIndexOf("a")); ///5

        System.out.println("Does "+word2+" contain x "+word2.contains("x"));
        System.out.println(word2 +" with the t replaced by m "+
                word2.replace("t", "m"));






    }
}
