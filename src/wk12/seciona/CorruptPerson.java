package wk12.seciona;

public class CorruptPerson extends Person {
    private String name;
    private int age;

    public CorruptPerson(String name, int age) {
        super(name, age);
        this.name = name;
        this.age = age;
    }
    @Override
    public boolean unlock(String guess){
        return true;
    }


}
