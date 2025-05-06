package wk15.sectiona;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class WriteAndReadBinary {
    public static void main(String[] args) {
        byte x = 127;
        byte y = -128;
        byte[] data = {x, y, -3, -4, -5};
        Scanner scanner = new Scanner(System.in);
        //String filename = scanner.next();
        String filename = "nums/testFile2.bin";
        try {
            writeArray(data, filename);
            readArray(filename);
        } catch (IOException e){
            System.out.println("Error with reading or writing");
            System.out.println(e.getMessage());
        }
    }
    public static void writeArray(byte[] data, String filename)
    throws IOException{
        try(FileOutputStream out =
                    new FileOutputStream(filename)) {
            out.write(data);
            //            for (int i = 0; i<data.length; i++) {
//                out.write(data[i]);
//                //printWriter.print(data[i] + " ");
//            }
            //printWriter.close();
        }
    }
    public  static void readArray(String filename)
            throws IOException{
        try(FileInputStream in
                    = new FileInputStream(filename)){
            //int estimate = in.available();
            while (in.available() > 0){
                System.out.println((byte)in.read());
            }
//            byte[] output = new byte[3];
//            in.read(output);
//            for(byte b: output){
//                System.out.println(b);
//            }
//            System.out.println((byte)in.read());
//            System.out.println((byte)in.read());
//            System.out.println((byte)in.read());
//            System.out.println((byte)in.read());
//            System.out.println((byte)in.read());
//            System.out.println(in.read());
//            System.out.println(in.read());
//            System.out.println(in.read());
//            System.out.println(in.read());
//            System.out.println(in.read());
        }
    }
}
