package wk4.sectionb;

public class IndexOfExample {
    public static void main(String[] args) {
        String date = "03/04/1987s;lfkjdslfkjdslfjdslfkjdslkfjdslfjdslfkjds;lfjds;lfjdsl;kfjdslfkjds;lkfjdsfl;jdslkfjdsflkdsjflkdsjfls;kjfldsjflds;kfjsdlkjfdslkfjldsfkjdslfjds;lj";
        char target = '/';
        int index = -1;
        //out code here
        for(int i = 0; i < date.length() && index == -1; i++){
            char letter = date.charAt(i);
            if(letter == target){
                index = i;
            }
        }
        System.out.println("Index is "+index);
    }
}
