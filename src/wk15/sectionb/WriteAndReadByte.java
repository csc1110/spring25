package wk15.sectionb;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteAndReadByte {
    public static void main(String[] args) {
        //8 bits
        //byte x = 128;
        byte[] data = {-1,-2,-3,-4,-5};
        try {
            WriteText(data, "nums/testFile1.txt");
            WriteBinary(data, "nums/testFile1.bin");
            ReadBinary("nums/testFile1.bin");
        } catch (IOException e){
            System.out.println("Error writing to file");
        }
    }
    public static void ReadBinary(String filename){
        try(FileInputStream in
                    = new FileInputStream(filename)){
            byte[] buffer = new byte[3];
            in.read(buffer);
            for(byte b: buffer){
                System.out.println(b);
            }
//            while (in.available() > 0){
//                System.out.println((byte)in.read());
//            }
        } catch (IOException e){
            System.out.println("Error reading the file");
        }
    }
    public static void WriteBinary(byte[] data, String filename)
            throws IOException {
        try (FileOutputStream out
                     = new FileOutputStream(filename)) {
            out.write(data);
//            for (int i = 0; i < data.length; i++) {
//                out.write(data[i]);
//            }
        }
    }

    public static void WriteText(byte[] data, String filename)
            throws IOException{
        try(FileOutputStream out
                    = new FileOutputStream(filename);
            PrintWriter printWriter
                    = new PrintWriter(out)) {
            for (int i = 0; i < data.length; i++) {
                printWriter.print(data[i] + " ");
            }
        }
    }

}
