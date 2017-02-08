package ReflectionTest;

import java.io.FileOutputStream;
import java.util.*;
import java.lang.reflect.*;
/**
 * V1.0.0
 * Created by zhoumingkai on 2017/2/7.
 */
public class ReflectionTest {
    public static void main(String[] args){
        String name;
        if(args.length > 0){
            name = args[0];
        }else {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter calss name(e.g.java.util.Date):");
            name = in.next();
        }

        try{
            Class cl = Class.forName(name);
            Class supercl = cl.getSuperclass();
            String modifiers = Modifier.toString(cl.getModifiers());
            if(modifiers.length() > 0){
                System.out.println(modifiers + " ");
            }
            if (supercl != null && supercl != Object.class){
                System.out.println("extends" + supercl.getName());
            }
            System.out.println("\n{\n");
            System.out.println("Constructors~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            printConstructors(cl);
            System.out.println();
            System.out.println("Methods~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            printMethods(cl);
            System.out.println();
            System.out.println("Fields~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            printFields(cl);
            System.out.println("}");
        }catch (Exception e ){
            e.printStackTrace();
        }
        System.exit(0);
    }

    public static void printConstructors(Class cl){
        Constructor[] constructors = cl.getDeclaredConstructors();
        for(Constructor c : constructors){
            String name = c.getName();
            System.out.println("   ");
            String modifiers = Modifier.toString(c.getModifiers());
            if (modifiers.length() > 0){
                System.out.println(modifiers + " ");
            }
            System.out.println(name + "(");

            Class[] paramTypes = c.getParameterTypes();
            for(int j = 0; j < paramTypes.length; j++){
                if (j > 0){
                    System.out.println(",");
                }
                System.out.println(");");
            }
        }
    }

    public static void printMethods(Class cl){
        Method[] methods = cl.getDeclaredMethods();
        for(Method m : methods){
            Class retType = m.getReturnType();
            String name = m.getName();
            System.out.println("   ");
            String modifiers = Modifier.toString(m.getModifiers());
            if (modifiers.length() > 0){
                System.out.println(modifiers + " ");
            }
            System.out.println(retType.getName() + " " + "(");
            Class[] paramTypes = m.getParameterTypes();
            for (int j = 0; j < paramTypes.length; j ++){
                if (j > 0){
                    System.out.println(",");
                    System.out.println(paramTypes[j].getName());
                }
                System.out.println(");");
            }
        }
    }

    public static void printFields(Class cl){
        Field[] fields = cl.getDeclaredFields();
        for(Field f : fields){
            Class type = f.getType();
            String name = f.getName();
            System.out.println("   ");
            String modifiers = Modifier.toString(f.getModifiers());
            if (modifiers.length() > 0){
                System.out.println(modifiers + " ");
            }
            System.out.println(type.getName() + " " + name + ";");
        }
    }
}
