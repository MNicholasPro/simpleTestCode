package main.java.equals;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Objects;

/**
 * V1.0.0
 * Created by zhoumingkai on 2017/1/22.
 */
public class Employee {

    private String name ;
    private double salary;
    private Date hireDay;

    public Employee(String n, double s, int year, int month, int day) {
        name = n;
        salary = s;
        GregorianCalendar calendar = new GregorianCalendar(year, month - 1, day);
        hireDay = calendar.getTime();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Date getHireDay() {
        return hireDay;
    }

    public void setHireDay(Date hireDay) {
        this.hireDay = hireDay;
    }

    public void raiseSalary(double byPercent){
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    public boolean equals(Object otherObject){
        if (this == otherObject){
            return true;
        }

        if (otherObject == null){
            return false;
        }

        if(getClass() != otherObject.getClass()){
            return false;
        }

        Employee other = (Employee) otherObject;

        return Objects.equals(name, other.name) && salary == other.salary && Objects.equals(hireDay, other.hireDay);
    }

    public int hashCode(){
        return Objects.hash(name, salary, hireDay);
    }

    @Override
    public String toString(){
        return getClass().getName()+ "[name=" + name +",salary=" + salary + ",hireDay=" + hireDay + "]";
    }
}
