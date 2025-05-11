package wk15.reviewa;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class FileIOQuestion {
    public static void writeNumbers(ArrayList<String> list,
                                    String filename)
            throws IOException {
        try(FileOutputStream out = new FileOutputStream(filename);
            PrintWriter printWriter = new PrintWriter(out)){
            for(int i = 0; i<list.size(); i++){
                try {
                    printWriter.print(Integer.parseInt(list.get(i)) + " ");
                } catch (NumberFormatException e){
                    System.out.println("Error parsing "+list.get(i));
                }
            }
        }


    }
    public static ArrayList<String> readSmall(String filename,
                                              int maxLength) throws IOException{
        ArrayList<String> ret = new ArrayList<>();
        try(FileInputStream in =
                    new FileInputStream(filename);
            Scanner fileIn = new Scanner(in)){
            while(fileIn.hasNext()) {
                String word = fileIn.next();
                if(word.length() < maxLength){
                    ret.add(word);
                }
            }
            return ret;
        }


    }
}
