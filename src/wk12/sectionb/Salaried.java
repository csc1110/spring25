package wk12.sectionb;

public class Salaried extends Employee {
    private double salary;
    public Salaried(String name, int age, int id,
                    double salary){
        super(name, age, id);
        this.salary = salary;
        //super();
    }
    public void raise(){
        salary *= 1.1;
    }
    public double getPay(){
        return salary/24.0;
    }
    @Override
    public void display(){
        System.out.println("Salaried: "+salary);
    }

}
