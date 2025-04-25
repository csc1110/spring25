package wk12.sectionb;

import java.util.ArrayList;

public class Comission extends Employee {
    private double percent;
    private ArrayList<Double> sales;

    public Comission(String name, int age, int id,
                     double percent, ArrayList<Double> sales) {
        super(name, age, id);
        this.percent = percent;
        this.sales = sales;
    }
    public void addSale(double saleValue){
        sales.add(saleValue);
    }
    public double getPay(){
        double pay = 0;
        for(Double sale: sales){
            pay += percent *sale;
        }
        return pay;
    }
}
