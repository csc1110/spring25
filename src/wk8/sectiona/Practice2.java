package wk8.sectiona;

public class Practice2 {
    public static void main(String[] args) {
//        Create an array of Strings of size 3 and initialize with some values
//            Iterate over the array and sum up the length of all the words.
//            Iterate over the array and create a new word that is composed of the last letter of each word in the array.
//            Iterate over the array and count how many words contain an "o". You can use the String .contains() method.
//            Iterate over the array and count how many words equal “1234”
        String[] words = new String[3];
        words[0] = "foo";
        words[1] = "bar";
        words[2] = "taco";
        int sum = 0;
        for(int i = 0; i < words.length; i++){
            sum += words[i].length();
        }
        System.out.println(sum);

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < words.length; i++){
            char lastLetter = words[i].charAt(words[i].length() -1 );
            sb.append(lastLetter);
        }
        System.out.println(sb.toString());
        int count = 0;
        for(int i = 0; i < words.length; i++){
            if(words[i].contains("o")){
                count++;
//                int oCount = 0;
//                for(int j = 0; j < words[i].length(); j++){
//                    oCount++;
//                }
            }
//            if(oCount == 1){
//                count++;
//            }
        }
        int count2 = 0;
        for(int i = 0; i < words.length; i++) {
            if(words[i].equals("1234")){
                count2++;
            }
        }
        if(count2 > 0){
            System.out.println("There is a match");
        } else {
            System.out.println("No match");
        }
        int[][] map = new int[5][5];

        map[3][4] = 4;
    }
}
