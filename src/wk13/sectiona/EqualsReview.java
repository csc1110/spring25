package wk13.sectiona;

public class EqualsReview {
    public static void main(String[] args) {
        String word1 = "foobar";
        String word2 = new String("foobar");

        System.out.println("Are the same " + word1.equals(word2));
        System.out.println("Are the same " + (word1 == word2));





    }
}
