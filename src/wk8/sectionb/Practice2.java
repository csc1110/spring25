package wk8.sectionb;

public class Practice2 {
    public static void main(String[] args) {
//        Create an array of Strings of size 3 and initialize with some values
//            Iterate over the array and sum up the length of all the words.
//            Iterate over the array and create a new word that is composed of the last letter of each word in the array.
//            Iterate over the array and count how many words contain an ‘o’. You can use the String .contains() method.
//            Iterate over the array and count how many words equal “1234”
        String[] words = new String[3];
        words[0] = "foo";
        words[1] = "bar";
        words[2] = "taco";
        int totalLength = 0;
        for(int i = 0; i<words.length; i++){
            totalLength += words[i].length();
        }
        System.out.println(totalLength);

        String newWord = "";
        for(int i = 0; i<words.length; i++){
            newWord += words[i].charAt(words[i].length() -1);
        }
        System.out.println(newWord);
        int containsO = 0;
        for(int i = 0; i<words.length; i++){
            if(words[i].contains("o")){
                containsO++;
            }
        }
        System.out.println(containsO);

        // String pass = "1234";
        int count2 = 0;
        for(int i = 0; i<words.length; i++){
            if(words[i].equals("1234")){
                count2++;
            }
        }
        System.out.println(count2);
    }
}
