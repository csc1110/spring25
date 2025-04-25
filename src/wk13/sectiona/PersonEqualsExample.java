package wk13.sectiona;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonEqualsExample {
    public static void main(String[] args) {
        //All people allowed into a club
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("Sam", 18));
        people.add(new Person("Max", 54));
        people.add(new Person("Jamie", 23));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = scanner.next();
        System.out.println("Enter your age");
        int age = scanner.nextInt();

        Person testPerson = new Person(name, age);
        //Person testPerson = people.get(1);//new Person(name, age);
        System.out.println(testPerson == people.get(1));
        System.out.println(testPerson.equals(people.get(1)));

        if(people.contains(testPerson)){
            System.out.println("Access granted");
        } else{
            System.out.println("Access denied");
        }

//        for(Person p:people){
//            //if(p.getName().equals(name) && p.getAge() == age){
//            if(p.equals(testPerson)){
//                System.out.println("Access granted");
//            }
//        }


    }
}
