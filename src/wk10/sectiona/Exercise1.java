package wk10.sectiona;

import java.util.ArrayList;

public class Exercise1 {
//        Takes in an ArrayList of Strings and returns the reverse. Reverse()
    public static ArrayList<String> reverse(ArrayList<String> list){
        ArrayList<String> ret = new ArrayList<>();

        for(int i = 0; i<list.size(); i++) {
            ret.add(list.get(list.size() - i - 1));
        }

        return ret;
    }
//        Takes in an ArrayList of Integers and
//        creates a new ArrayList of Integers with the
//        first half of the elements of the original
//        ArrayList. halfArray()
    private static ArrayList<Integer> halfArray(ArrayList<Integer> list){
        ArrayList<Integer> ret = new ArrayList<>();
        for(int i = 0; i<list.size()/2; i++){
            ret.add(list.get(i));
        }
        return ret;
    }
//        Takes in an array of Strings and returns the index
//        of the String with the max length. maxLocation()

    private static int maxLocation(ArrayList<String>  list){
        int max = list.get(0).length();

        for(int i = 0; i<list.size(); i++){
            if(list.get(i).length() < max){
                max = list.get(i).length();
            }
        }
        return max;

    }


    public static void main(String[] args) {




    }
}
