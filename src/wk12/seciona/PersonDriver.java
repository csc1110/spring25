package wk12.seciona;

import java.util.ArrayList;

public class PersonDriver {
    public static void main(String[] args) {

        Person p1  = new Person("Sam", 23);

        System.out.println(p1.age);

        System.out.println(p1.getName());
        System.out.println(p1.getAge());
        p1.display();

        //Sellable s1 = new Sellable();
//        Employee e1 =
//                new Employee("Jessica", 30, 2);
//        System.out.println("Id is "+e1.getId());
//
//        System.out.println(e1.getName());
//        System.out.println(e1.getAge());
//        e1.display();
//
//        Person p2;
//        Employee e2 = new Employee("Billy", 23, 1);
//        p2 = e2;
//        Sellable s1;
//        Weapon weapon = new Weapon(14);
//        s1 = weapon;
//
//        ArrayList<Person> people = new ArrayList<>();
//
//        people.add(new Employee("Janet", 40, 3));
//        people.add(new Person("Mike", 18));
//        //people.add(new Employee("Mike", 18, 4));
//        //people.add(new Employee("Cindy", 21, 4));
//
//        for(Person p : people){
//            System.out.println(p.getName());
//            System.out.println(p.getAge());
//            p.display();
//            if(p instanceof Employee){
//                System.out.println(((Employee)p).getId());
//            }
//        }
    }
}
