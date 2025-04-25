package wk12.sectionb;

public class Hourly extends Employee {
    private double rate;
    private double hours;

    public Hourly(String name, int age,
                  int id, double rate,
                  double hours){
        super(name, age, id);
        this.rate = rate;
        this.hours = hours;
    }
    public void addHours(int hours){
        this.hours += hours;
    }
    public double getPay(){
        return hours * rate;
    }
}
