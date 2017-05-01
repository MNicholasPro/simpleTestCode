package main.java.abstructClasses;

/**
 * V1.0.0
 * Created by zhoumingkai on 2017/1/20.
 */
public abstract class Person {
    public abstract String getDescription();

    private String name;

    public Person(String n){
        name = n;
    }

    public String getName() {
        return name;
    }
}
