package abstructClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * V1.0.0
 * Created by zhoumingkai on 2017/1/20.
 */
public class PersonTest {
    public static void main(String[] args){
        Person[] people = new Person[2];
        Object[] people2 = new Person[2];
        Person[] people3 = new Person[2];

        people[0] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
        people[1] = new Student("Maria Morris", "computer science");

        people2[0] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
        people2[1] = new Student("Maria Morris", "computer science");

        people3[0] = (Person) people2[0];
        people3[1] = (Person) people2[1];

        System.out.println("people");
        for(Person p : people){
            System.out.println(p.getName()+","+p.getDescription());
        }

        System.out.println("people3");

        for(Person p2 : people3){
            System.out.println(p2.getName()+","+p2.getDescription());
        }

        List A = new ArrayList();
        System.out.println(A.getClass() == ArrayList.class);
    }
}
