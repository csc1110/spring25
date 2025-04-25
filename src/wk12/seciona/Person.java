package wk12.seciona;

public class Person {
    private String name;
    protected int age;
    private String password = "1234";


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public boolean unlock(String guess){
        return guess.equals(password);
    }
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    public void display(){
        System.out.println("Name: "+name+", Age: "+age);
    }
}
