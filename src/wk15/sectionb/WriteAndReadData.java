package wk15.sectionb;

import java.io.*;

public class WriteAndReadData {
    public static void main(String[] args) {
        try{
          WriteData("nums/testFile2.bin");
          ReadData("nums/testFile2.bin");
        } catch (IOException e){
            System.out.println("Error writing to file");
        }

    }
    public static void WriteData(String filename) throws IOException{
        try(FileOutputStream out
                    = new FileOutputStream(filename);
            DataOutputStream dOut
                    = new DataOutputStream(out)){
            dOut.writeDouble(3.14);
            dOut.writeInt(1_000_000_000);
            dOut.writeBoolean(false);
        }
    }
    public static void ReadData(String filename)
            throws IOException{
        try(FileInputStream in
                = new FileInputStream(filename);
        DataInputStream dIn
                = new DataInputStream(in)){
            System.out.println(dIn.readDouble());
            System.out.println(dIn.readInt());
            System.out.println(dIn.readBoolean());
        }

    }
}
