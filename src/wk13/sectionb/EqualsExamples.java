package wk13.sectionb;

import java.util.ArrayList;
import java.util.Scanner;

public class EqualsExamples {
    public static void main(String[] args) {
        ArrayList<Person> vip = new ArrayList<>();
        vip.add(new Person("Jessica", 24));
        vip.add(new Person("Ben", 30));
        vip.add(new Person("Alex", 45));
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter your name");
//        String name = scanner.next();
//        System.out.println("Enter your age");
//        int age = scanner.nextInt();
        Person testPerson = new Person("Alex", 45);
        //Person testPerson = vip.get(2);
        //Person testPerson = new Person(name, age);
        System.out.println(testPerson.equals(vip.get(2)));
        System.out.println(testPerson == vip.get(2));
        if(vip.contains(testPerson)){
            System.out.println("Access granted");
        } else {
            System.out.println("Access denied");
        }
//        for(int i = 0; i<vip.size(); i++){
//            //if(name.equals(vip.get(i).getName())
//            //        && age == vip.get(i).getAge()){
//            if(testPerson.equals(vip.get(i))){
//                System.out.println("Access granted");
//                System.out.println("Index "+i);
//            }
//        }

    }
}
