package wk6.sectiona;

import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class ArraysIntro {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1;
        int num2;
        int num3;

        System.out.println("Enter a number");
        num1 = scan.nextInt();
        System.out.println("Enter a number");
        num2 = scan.nextInt();
        System.out.println("Enter a number");
        num3 = scan.nextInt();

        double avg = (num1 + num2 + num3)/3.0;

        int[] values;
        values = new int[3];

        values[0] = 42;
        System.out.println(values[0]);
        System.out.println(values[0] * 2);
        int num = values[0] + 2;



    }
}
