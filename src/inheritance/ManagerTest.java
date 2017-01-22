package inheritance;

/**
 * V1.0.0
 * Created by zhoumingkai on 2017/1/17.
 */
public class ManagerTest {
    public static void main(String[] args){
        Manager boss = new Manager("Carl Cracker", 80000, 1987, 12, 15);
        boss.setBonus(5000);
        boss.setNname(" Chou");

        Employee[] staff = new Employee[3];

        staff[0] = boss;
        staff[1] = new Employee("Harry Hacker", 5000, 1989, 10, 1);
        staff[2] = new Employee("Tommy Tester", 4000, 1990, 3, 15);

        for (Employee e : staff){
            System.out.println("name = "  + e.getName() + ",salary = " + e.getSalary() + ",hireDay = " + e.getHireDay());
        }

        double a = 3.08;
        int b = (int)a;
        long c = (long)a;
        System.out.println(b+","+c);
    }
}
