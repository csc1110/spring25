package wk8.sectiona;

public class Practice3 {

    //makes that in an array of ints and an int
    //returns the element at an index
    //called printElement
    public static int outOfBound(int[] array, int index){
        if(index > 0 && index < array.length){
            return array[index];
        } else{
            return 0;
        }
    }
    //create a method that takes in array of ints
    //returns the avg values
    //method is alled avgValue

    public static double avgValue(int[] array){
        int sum = 0;
        for(int i = 0; i<array.length; i++){
            sum += array[i];
        }
        return sum / (double) array.length;
    }

    public static void main(String[] args) {

    }
}
