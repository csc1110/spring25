package wk13.sectionb;

import wk13.sectiona.Weapons;

import java.util.ArrayList;
import java.util.Scanner;

public class ObjectDriver {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        Person p1;
        p1 = new Hourly("Sam", 24, 1, 15, 100);

        Person p2 = new Salaried("Jack", 18, 2, 60_000);

        people.add(new Hourly("Sam", 24, 1, 15, 100));
        people.add(new Salaried("Jack", 18, 2, 60_000));

        for(int i = 0; i<people.size(); i++){
            System.out.println(people.get(i).getAge());
        }
        temp1(new Hourly("Sam", 24, 1, 15, 100));
        temp1(new Salaried("Jack", 24, 2, 150_000));

        ArrayList<Object> objects = new ArrayList<>();
        objects.add(new Person("Jamie", 23));
        objects.add(new Salaried("Jackie", 23,3, 70_000));
        objects.add(new Scanner(System.in));
        objects.add(new Weapons(15));
        Object o1 = new Person("Alex", 55);
        //Person p3 = new Object();
        for(int i = 0; i<objects.size(); i++){
            System.out.println(objects.get(i).hashCode());
            System.out.println(objects.get(i).equals(null));
            System.out.println(objects.get(i).toString());
            if(objects.get(i) instanceof Scanner){
                ((Scanner) objects.get(i)).nextInt();
            }
        }
        temp2(new Scanner(System.in));
        temp2(new Person("Molly", 19));
    }
    private static void temp1(Person p){
        System.out.println(p.getAge());
    }
    private static void temp2(Object o){

    }
}
