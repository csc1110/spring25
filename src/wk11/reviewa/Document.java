package wk11.reviewa;

public class Document {
    private static final int MAX_WORDS = 10;
    private String[] words;
    private int wordCount;

    public Document(){
        //words[MAX_WORDS]
        this.words = new String[MAX_WORDS];
        wordCount = 0;
    }
    public int find(String target){
        int index = -1;
        boolean isFound = false;
        for(int i = 0; i<wordCount; i++){
            if(target.equals(words[i]) && !isFound){
                index = i;
                isFound = true;
            }
        }
        return index;
    }
    public void addWord(String word){
        if(wordCount < words.length){
            words[wordCount] = word;
            wordCount++;
        }
    }
    public int getWordCount() {
        return wordCount;
    }
}
