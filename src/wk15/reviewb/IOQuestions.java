package wk15.reviewb;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class IOQuestions {

    public static ArrayList<String> readSmall(String filename,
                                              int maxLength)
            throws IOException{
        ArrayList<String> list = new ArrayList<>();
        try(FileInputStream in = new FileInputStream(filename);
            Scanner fileIn = new Scanner(in)){
            String word;
            while(fileIn.hasNext()){
                word = fileIn.next();
                if(word.length() < maxLength){
                    list.add(word);
                }
            }
        }
        return list;
    }


    public static void writeNumbers(ArrayList<String> list,
                                 String filename)
            throws IOException {
        try(FileOutputStream out =
                    new FileOutputStream(filename);
            PrintWriter printWriter = new PrintWriter(out);){
            int num;
            for(String word: list) {
                try {
                    num = Integer.parseInt(word);
                    printWriter.print(num + " ");
                } catch(NumberFormatException e){
                    System.out.println("Error can't parse "+word);
                }
            }
        }

    }
}
