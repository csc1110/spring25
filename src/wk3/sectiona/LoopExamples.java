package wk3.sectiona;

public class LoopExamples {
    public static void main(String[] args) {
        //initialization
        //update
        //conditional

        System.out.println("While loop");
        //Really good when you don't know how
        //many times you need to loop.

        //initiailizing control variable
        int count = 0;
        //conditional
        while(count < 10){
            System.out.println("count is "+count);
            //update
            count++;
        }

        System.out.println("Do while");

        count = 0;
        //conditional
        do {
            System.out.println("count is "+count);
            //update
            count++;
        } while(count < 10); //conditional

        System.out.println("for loop");
        //(initialization; conditional; update)
        int count2;
        for(count2 = 0; count2 < 10; count2++) {
            System.out.println("Count is "+count2);
        }
        System.out.println(count2);

    }
}
