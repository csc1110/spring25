package wk5.reviewa;

import java.util.Scanner;

public class LongQuestion1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String date;
        System.out.println("Enter the date in teh form dd/mm/yyyy");
        date = scan.nextLine();
        int month = Integer.parseInt(date.substring(3, 5));

        if(month >= 3 && month <= 5){
            System.out.println("Spring!!!");
        } else if(month < 12 && month > 8){
            System.out.println("Fall!!!");
        } else if(month >= 6 && month <= 8){
            System.out.println("summer");
        } else{
            System.out.println("Winter");
        }


    }
}
