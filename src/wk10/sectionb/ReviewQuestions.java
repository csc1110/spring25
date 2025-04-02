package wk10.sectionb;

public class ReviewQuestions {
    public static void main(String[] args) {
        String[] words = {"foo", "bar", "foo", "cat"};
        int index = -1;
        String target = "foo";

        for(int i = 0; i<words.length && index == -1; i++){
            if(words[i].equals(target)){
                index = i;
            }
        }
        index = -1;
        int count = 0;
        //runs through the entire array no matter what
        for(String w: words){
            if(index == -1 && w.equals(target)){
                index = count;
            }
            count++;
        }

    }
}
