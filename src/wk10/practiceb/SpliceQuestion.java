package wk10.practiceb;

import java.util.ArrayList;

public class SpliceQuestion {
    public static void main(String[] args) {

    }
    public static ArrayList<Integer> splice(ArrayList<Integer> list1,
                                            ArrayList<Integer> list2){
        ArrayList<Integer> splice = new ArrayList<>();

        for(int i = 0; i< list1.size(); i++){
            splice.add(list1.get(i));
            splice.add(list2.get(i));
        }

        return splice;
    }
}
