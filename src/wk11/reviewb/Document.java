package wk11.reviewb;

public class Document {
    private static final int MAX_WORDS = 10;
    private String[] words;
    private int wordCount;

    public Document(){
        this.words = new String[MAX_WORDS];
        wordCount = 0;
    }
    public int find(String target){
        int index = -1;
        for(int i = 0; i < wordCount && index == -1; i++){
            if(words[i].equals(target)){
                index = i;
            }
        }
        return index;
    }
    public void addWord(String word){
        if(wordCount < MAX_WORDS){
            words[wordCount] = word;
            wordCount++;
        }
    }
    public int getWordCount(){
        return wordCount;
    }
}
