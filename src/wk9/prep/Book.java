package wk9.prep;

import java.util.ArrayList;

public class Book {
    private final ArrayList<String> pages;
    private String title;
    private final ArrayList<Integer> bookmarked;
    private final ArrayList<String> notes;
    public Book(String title) {
        this.pages = new ArrayList<>();
        bookmarked = new ArrayList<>();
        this.title = title;
        this.notes = new ArrayList<>();
    }
    public void bookMarkPage(int page){
        bookmarked.add(page);
    }
    public void addPage(String page){
        pages.add(page);
    }
    public String readPage(int pageNumber){
        return pages.get(pageNumber);
    }
    public String readBookmarked(){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<bookmarked.size(); i++){
            sb.append(pages.get(i));
        }
        return sb.toString();
    }
    private boolean validPage(int pageNumber){
        return pageNumber > 0 && pageNumber < pages.size();
    }
}
