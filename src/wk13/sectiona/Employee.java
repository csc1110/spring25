package wk13.sectiona;

public abstract class Employee extends Person {
    private int id;
    public Employee(String name, int age, int id){
        super(name, age);
        //super();
        this.id = id;
    }
//    public Employee(){
//        //name - test, age = 30, id = 0
//        this("test", 30, 0);
//        int x = 4;
//    }
    public int getId() {
        return id;
    }
    @Override
    public String getName(){
        return getName() + ":" + id;
    }

    @Override
    public void display(){
        System.out.println("Employee id: "+id);
    }

    public abstract double getPay();//{
        //return 0;
    //}
}
