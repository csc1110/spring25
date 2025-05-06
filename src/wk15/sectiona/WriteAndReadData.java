package wk15.sectiona;

import java.io.*;

public class WriteAndReadData {
    public static void main(String[] args) {

        try(FileOutputStream out = new FileOutputStream("nums/testFile3.bin");
            DataOutputStream dOut = new DataOutputStream(out)){
            dOut.writeByte(127);
            dOut.writeInt(2_000_000_000);
            dOut.writeDouble(3.14);
            dOut.writeBoolean(false);
        } catch (IOException e){
            System.out.println("error writing file");
        }
        try(FileInputStream in = new FileInputStream("nums/testFile3.bin");
            DataInputStream dIn = new DataInputStream(in)){
            System.out.println(dIn.readByte());
            System.out.println(dIn.readInt());
            System.out.println(dIn.readDouble());
            System.out.println(dIn.readBoolean());
        } catch (IOException e){

        }
    }
}
