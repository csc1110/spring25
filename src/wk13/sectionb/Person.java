package wk13.sectionb;

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
        return "Name: "+name+", Age: "+age;
    }
//    public boolean equals(Person person){
//
//    }

    @Override
    public boolean equals(Object obj){
        boolean ret = false;
        if(obj == this){
            ret = true;
        } else if(obj == null){
            ret = false;
        } else if(!(obj instanceof Person)){
            ret = false;
        } else {
            Person testPerson = (Person) obj;
            ret = name.equals(testPerson.name) &&
                    age == testPerson.age;
        }
        return ret;
    }
}
