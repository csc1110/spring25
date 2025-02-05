package wk3.sectionb;

public class LoopExamples {
    public static void main(String[] args) {

        //initialization
        //update
        //condition


        System.out.println("while loop");
        //initlaization
        int count = 0;
        //condition
        while(count < 10){
            System.out.println("Count is "+count);
            count++; //update
        }

        System.out.println("do while loop");

        //initlaization
        count = 0;
        do {
            System.out.println("Count is "+count);
            count++; //update
        } while(count < 10); //condition

        System.out.println("for loop");
        //(initialization; condition; update)
        int count2;
        for(count2 = 9; count2 >= 0; count2--){
            System.out.println("Count is "+count2);
        }
        System.out.println(count2);
    }
}
