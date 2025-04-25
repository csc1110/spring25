package wk12.sectionb;

import wk12.seciona.Commissioned;

import java.util.ArrayList;

public class EmployeeDriver {
    public static void main(String[] args) {
        Salaried s1 =
                new Salaried("Jill", 23, 1, 50_000);

        s1.raise();
        System.out.println(s1.getPay());

        s1.display();
        System.out.println(s1.getAge());

        Employee e2 = s1;
        Person p2 = s1;

        ArrayList<Person> people = new ArrayList<>();


        people.add(s1);

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Salaried("Max", 25, 2, 65_000));
        employees.add(new Hourly("Sam", 45, 3, 15, 10));
        for(Employee e: employees){
            e.display();
            System.out.println(e.getId());
            System.out.println(e.getAge());
            if(e instanceof Hourly){
                ((Hourly)e).addHours(10);
            } else if(e instanceof Salaried){
                ((Salaried) e).raise();
            }
        }
        int payroll = 0;
        Comission c1 =
                new Comission("Bob", 23, 5,
                        0.1, new ArrayList<>());
        c1.addSale(1000);
        employees.add(c1);
        for(Employee e: employees){
            System.out.println("Pay value "+e.getPay());
            //payroll += e.getPay();
//            if(e instanceof Hourly){
//                payroll += ((Hourly)e).getPay();
//            } else if(e instanceof Salaried){
//                payroll += ((Salaried)e).getPay();
//            }
        }
    }
}
