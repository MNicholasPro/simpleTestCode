package main.java.fanzhuan;

import java.util.Scanner;

/**
 * V1.0.0
 * Created by zhoumingkai on 2017/3/9.
 */
public class Run {

    public Run() {
        System.out.print("请输入一个字符串：");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println();
        String reversedStrByArray = new Reverse(str).reverseByArray();
        System.out.println("对应反转字符串为[Array]："+ reversedStrByArray);
        String reversedStrByStack = new Reverse(str).reverseByStack();
        System.out.println("对应反转字符串为[Stack]："+ reversedStrByStack);
        String reversedStrBySort = new Reverse(str).reverseBySort();
        System.out.println("对应反转字符串为[逆序遍历]："+ reversedStrBySort);
        String reversedStrByBit = new Reverse(str).reverseByBit();
        System.out.println("对应反转字符串为[位运算]："+ reversedStrByBit);
        String reversedStrByRecursive = new Reverse(str).reverseByRecursive(str);
        System.out.println("对应反转字符串为[递归]："+ reversedStrByRecursive);
    }

    public static void main(String[] args) {
        new Run();
    }

}
