package model;

public class Employee {
    public String name;
    public Double grossSalary, tax;
    
    public double netSalary(){
        return grossSalary - tax;
    }

    public void increase(double increase){
        grossSalary += grossSalary * (increase / 100);
    }

    public String toString(){
        return name + ", $ " + String.format("%.2f", netSalary());    }
}
