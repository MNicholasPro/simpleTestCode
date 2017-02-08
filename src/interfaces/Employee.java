package interfaces;

/**
 * V1.0.0
 * Created by zhoumingkai on 2017/2/8.
 */
public class Employee implements Comparable<Employee>{
    private String name;
    private double salary;

    public Employee(String n , double s){
        name = n;
        salary = s;
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

    public void raiseSalary(double byPercent){
        double raise = salary * byPercent /100;
        salary += raise;
    }

    public int compareTo(Employee other){
        return Double.compare(salary, other.salary);
    }
}
