package wk10.sectionb;

public class Exercise1 {


//        Takes in an ArrayList of Strings and returns the reverse. Reverse()
    public static String[] reverse(String[] list){
        String[] rev = new String[list.length];
        for(int i = 0; i < list.length; i++){

            rev[i] = list[list.length - i - 1];
        }
        int j = 0;
        for(int i = list.length - 1; i >= 0; i--){
            rev[j] = list[i];
            j++;
        }

        return rev;

    }
//        Takes in an ArrayList/array of Strings and
//        creates a new array of Strings with double
//        the elements of the original array. doubleArray()
//    public static String[] doubleArray(String[] list){
//        String[] ret = new String[list.length * 2];
//        for(int i = 0; i<list.length; i++){
//            ret[i] = list[i];
//        }
//        int j = list.length;
//        for(int i = 0; i<list.length; i++){
//            ret[j] = list[i];
//            j++;
//        }
//
//    }


//        Takes in an ArrayList of Strings and returns the reverse. Reverse()
//        Takes in an ArrayList of Strings and creates a new array of Strings with double the elements of the original array. doubleArray()



    public static void main(String[] args) {



    }
}
