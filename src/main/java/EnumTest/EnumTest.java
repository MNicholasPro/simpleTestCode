package main.java.EnumTest;

import java.util.Scanner;

/**
 * V1.0.0
 * Created by zhoumingkai on 2017/2/3.
 */
public class EnumTest {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Entera a size:(SMALL, MEDIUM, LARGE, EXTRA_LRGE)");
        String input = in.next().toUpperCase();
        Size size = Enum.valueOf(Size.class, input);
        System.out.println("Size=" + size);
        System.out.println("abbreviation=" + size.getAbbreviation());
        if(size == Size.EXTRA_LARGE){
            System.out.println("Good job--you paid attention to the -.");
        }
    }

    public enum Size {
        SMALL("S"),
        MEDIUM("M"),
        LARGE("L"),
        EXTRA_LARGE("XL");

        private String abbreviation;
        private Size(String abbreviation) {
            this.abbreviation = abbreviation;
        }

        public String getAbbreviation() {
            return abbreviation;
        }

        public void setAbbreviation(String abbreviation) {
            this.abbreviation = abbreviation;
        }
    }
}
