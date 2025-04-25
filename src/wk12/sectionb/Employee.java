package wk12.sectionb;

public abstract class Employee extends Person {
    private int id;
    public Employee(String name, int age, int id) {
        super(name, age);
        this.id = id;
    }
//    public Employee(){
//        super(null, 0);
//        //this("test", 0, 0);
//    }
    public int getId() {
        return id;
    }
    @Override
    public String getName(){
        return super.getName() + ":" + id;
    }
    @Override
    public void display(){
        System.out.println("Employee id is "+id);
    }

    public abstract double getPay();//{
        //return 0;
    //}
}
