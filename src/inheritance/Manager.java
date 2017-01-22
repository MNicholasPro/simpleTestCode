package inheritance;

/**
 * V1.0.0
 * Created by zhoumingkai on 2017/1/17.
 */
public class Manager extends Employee {
    private double bonus;
    private String nname;
    public Manager(String n, double s, int year, int month, int day){
        super(n, s, year, month, day);
        bonus = 0;
    }

    public double getSalary(){
        double baseSalary = super.getSalary();
        return baseSalary + bonus;
    }

    public String getNname() {
        String baseName = super.getName();
        return baseName + nname;
    }

    public void setBonus(double b){
        bonus = b;
    }

    public void setNname(String nname) {
        this.nname = nname;
    }
}
