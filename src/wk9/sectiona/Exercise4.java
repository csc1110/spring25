package wk9.sectiona;

import java.util.ArrayList;

public class Exercise4 {

//    Create static methods that do the following
//    Takes in an ArrayList of Strings and returns the largest String
//    Takes in ints for the size and min and max value and returns an ArrayList of all the even values between min and max
//    Take in an ArrayList and returns the reverse
//    Takes in an ArrayList and two ints for a min and a max. Returns a new ArrayList that just contains the elements of the original ArrayList greater than min and less than max.
//    Take in an ArrayList and returns a new ArrayList that is twice the size of the old ArrayList and contains two copies of the elements in the old ArrayList
//i.e. {1,2,3,4} -> {1,2,3,4,1,2,3,4} or {1,2,3,4} -> {1,1,2,2,3,3,4,4}


    //largestString
    private static String largestString(ArrayList<String> list){
        String maxString = list.get(0);
        for(int i = 0; i<list.size(); i++){
            if(list.get(i).length() > maxString.length()){
                maxString = list.get(i);
            }
        }
        return maxString;
    }

    //Takes in ints for the size and min and max value and returns an ArrayList of all the even values between min and max

    private static ArrayList<Integer> makeEvens(int size, int min, int max){
        //declare a return variable
        ArrayList<Integer> ans = new ArrayList<>();

        //modify the variable


        return ans;
    }


    public static void main(String[] args) {


    }
}
