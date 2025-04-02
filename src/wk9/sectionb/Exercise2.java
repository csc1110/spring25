package wk9.sectionb;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Exercise2 {
//    Create static methods that do the following

//    Takes in a size and min and max value. Returns an ArrayList with size number of even elements from min to max. Call it getEvenValues()
//    Take in an ArrayList and returns the reverse. Call it reverse().
//    Takes in an ArrayList and two ints for a min and a max. Returns a new ArrayList that just contains the elements of the original ArrayList greater than min and less than max. Call the method filter().
//    Take in an ArrayList and returns a new ArrayList that is twice the size of the old ArrayList and contains two copies of the elements in the old ArrayList. Call it doubleArray().
//            i.e. {1,2,3,4} -> {1,2,3,4,1,2,3,4} or {1,2,3,4} -> {1,1,2,2,3,3,4,4}

//    Takes in an ArrayList of Strings and returns
//    the largest String. Call the method
//    getLargestString().

    public static String getLargestString(ArrayList<String> list){
        String mostLetters = list.get(0);
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).length() > mostLetters.length()){
                mostLetters = list.get(i);
            }
        }
        //int longest = list.get(0).length();
        mostLetters = list.get(0);
        for(String word: list){
            if(word.length() > mostLetters.length()){
                mostLetters = word;
                //longest = mostLetters.length();
            }
        }
        return mostLetters;
    }

    //    Takes in a size and min and max value.
    //    Returns an ArrayList with size number
    //    of even elements from min to max. Call
    //    it getEvenValues()
    private static ArrayList<Integer> getEvenValues(int size, int min,int max){
        ArrayList<Integer> evenNums = new ArrayList<>();

        for(int i = min; i < max && evenNums.size() < size; i++){
            if(i % 2 == 0){
                evenNums.add(i);
            }
//            if(evenNums.size() == size){
//                return evenNums;
//            }
        }
        return evenNums;
    }


}
