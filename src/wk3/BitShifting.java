package wk3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class BitShifting {
    public static void main(String[] args) {
        String s = "01111111";
        System.out.println();
//        byte x = 0b01111111;
//        System.out.println(String.format("%8s",Integer.toBinaryString(x<<2)).replace(" ","0"));
        byte[] pixels = {1,1,0,0,1,1,0,1,1,0,1,0,1,1,0};
        try {
            writePixels("pixels.isml", pixels);
            readPixels("pixels.isml");
        } catch (FileNotFoundException e){
            System.out.println("Error find the file");
        } catch (IOException e){
            System.out.println("Error writing to the file");
        }
    }
    public static void writePixels(String filename, byte[] pixels) throws IOException{
        try(FileOutputStream out = new FileOutputStream(filename)){
            byte v = 0b00000000;
            int shift = 8;
            //width
            out.write(4);
            //height
            out.write(4);
            for(int i = 0; i<pixels.length; i++){
                v = (byte) (v | (pixels[i] << (7 - i%7)));
                if(i == 7){
                    out.write(v);
                    v = 0b00000000;
                }
            }
            if(pixels.length % 8 != 0){
                out.write(v);
            }
        }
    }
    public static void readPixels(String filename) throws IOException{
        ArrayList<Byte> pixels = new ArrayList<>();
        try(FileInputStream in = new FileInputStream(filename)){
            int width = in.read();
            int height = in.read();
            for(int i = 0; i<width*height; i++){
                byte b = (byte)in.read();
                //"00000000"


            }
        }
    }
}
