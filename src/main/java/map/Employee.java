package main.java.map;

/**
 * V1.0.0
 * Created by zhoumingkai on 2017/2/16.
 */
public class Employee {
    private String name ;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                '}';
    }
}
