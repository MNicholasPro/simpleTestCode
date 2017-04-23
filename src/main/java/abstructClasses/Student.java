package main.java.abstructClasses;

/**
 * V1.0.0
 * Created by zhoumingkai on 2017/1/20.
 */
public class Student extends Person{
    private String major;

    /*
    * @param n student's name
    * @param m student's major
    * */
    public Student(String n, String m){
        super(n);
        major = m;
    }

    public String getDescription(){
        return "a student major in "+major;
    }

/*    public static void main(String[] args) {
        Class cls =  Class.forName("main.java.abstructClasses.Student");
        Object obj = cls.newInstance();

        Method[] methods = obj.getClass().getMethods();
        methods[0].invoke(obj,args)
    }*/
}
