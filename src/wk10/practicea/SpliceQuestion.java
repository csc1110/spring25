package wk10.practicea;

import java.util.ArrayList;

public class SpliceQuestion {

    public static ArrayList<Integer> splice(ArrayList<Integer> a,
                                     ArrayList<Integer> b){
        ArrayList<Integer> ret = new ArrayList<>();

        for(int i = 0; i < a.size(); i++){
            ret.add(a.get(i));
            ret.add(b.get(i));
        }

//        for(int i = 0; i < a.size(); i++){
//            ret.add(a.get(i));
//        }
//        for(int i = 0; i < a.size(); i++){
//            ret.add(b.get(i));
//        }
        return ret;
    }




    public static void main(String[] args) {

    }
}
