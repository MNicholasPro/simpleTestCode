package main.java.clone;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 * V1.0.0
 * Created by zhoumingkai on 2017/2/8.
 */
public class Employee implements Cloneable{
    private String name;
    private double salary;
    private Date hireDay;

    public Employee(String n, double s){
        name = n;
        salary = s;
        hireDay = new Date();
    }

    public Employee clone() throws CloneNotSupportedException{
        Employee cloned = (Employee)super.clone();
        cloned.hireDay = (Date)hireDay.clone();

        return cloned;
    }

    public void setHireDay(int year,int month, int day){
        Date newHireDay = new GregorianCalendar(year,month-1,day).getTime();
        hireDay.setTime(newHireDay.getTime());
    }

    public void raiseSalary(double byPercent){
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", hireDay=" + hireDay +
                '}';
    }
}