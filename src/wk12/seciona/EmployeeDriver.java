package wk12.seciona;

import java.util.ArrayList;

public class EmployeeDriver {
    public static void main(String[] args) {
        Salaried s1 =
                new Salaried("Jim", 23, 1, 35_000);

        s1.raise();
        System.out.println("Pay amount " + s1.getPay());

        s1.display();
        System.out.println(s1.getAge());

        Person p1 = s1;

        Employee e1 = s1;
        Employee e2 =
                new Hourly("Sally", 34, 2, 15, 10);

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(s1);
        employees.add(e2);
        employees.add(new Salaried("Sam", 43, 3, 50_000));
        employees.add(new Commissioned("Jack",
                20, 4, 0.05, new ArrayList<>()));
        for(Employee e: employees){

            e.display();
            System.out.println(e.getAge());

            if(e instanceof Salaried){
                ((Salaried)e).raise();
            } else if(e instanceof Hourly){
                ((Hourly)e).addHours(10);
            } else if(e instanceof Commissioned){
                ((Commissioned) e).addSell(1000);
            }
        }
        double payroll = 0;
        for(Employee e :employees){
            System.out.println(e.getName());
            e.display();
            System.out.println(e.getPay());
            //payroll += e.getPay();
        }
    }
}
