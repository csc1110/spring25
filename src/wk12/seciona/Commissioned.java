package wk12.seciona;

import java.util.List;

public class Commissioned extends Employee {
    private double percentage;
    private List<Double> sold;

    public Commissioned(String name, int age, int id,
                        double percentage, List<Double> sold) {
        super(name, age, id);
        this.percentage = percentage;
        this.sold = sold;
    }
    public void addSell(double value){
        sold.add(value);
    }
    @Override
    public double getPay(){
        double pay = 0;
        for(Double d: sold){
            pay += d * percentage;
        }
        return pay;
    }
}
