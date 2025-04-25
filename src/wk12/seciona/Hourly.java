package wk12.seciona;

public class Hourly extends Employee {
    private double rate;
    private double hours;

    public Hourly(String name, int age, int id,
                  double rate, double hours) {
        super(name, age, id);
        this.rate = rate;
        this.hours = hours;
    }
    public void addHours(double hours){
        this.hours += hours;
    }
    @Override
    public double getPay(){
        return hours * rate;
    }
}
