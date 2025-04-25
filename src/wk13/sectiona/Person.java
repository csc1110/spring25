package wk13.sectiona;

public class Person {
    private String name;
    protected int age;
    private String password = "1234";


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    public void display(){
        System.out.println("Name: "+name+
                ", Age: "+age);

    }
    @Override
    public String toString(){
        return "Name: "+name+", Age:"+age;
    }
//    public boolean equals(Person person){
//
//    }
    @Override
    public boolean equals(Object obj){

        if(obj == this){
            return true;
        } else if(obj == null){
            return false;
        } else if(!(obj instanceof Person)){
            return false;
        } else {
            Person test = (Person) obj;
            return name.equals(test.name) &&
                    age == test.age;
        }
    }
}
