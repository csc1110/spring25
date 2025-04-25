package wk12.seciona;

import java.util.Scanner;

public class FinalExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Person p1;
        //p1 = new Person("Dave", 23);
        p1 = new CorruptPerson("Hacker",9999);

        System.out.println("Enter your password");
        String guess = scanner.next();
        System.out.println("Access granted "+grantAccess(p1, guess));
    }
    private static boolean grantAccess(Person person, String guess){
        return person.unlock(guess);
    }

}
