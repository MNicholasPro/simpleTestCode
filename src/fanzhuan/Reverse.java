package fanzhuan;

import java.util.Stack;

/**
 * V1.0.0
 * Created by zhoumingkai on 2017/3/9.
 */
public class Reverse {
    String str = new String();
    public Reverse(String str) {
        this.str = str;
    }
    //用数组实现
    public String reverseByArray() {
        if(str == null || str.length() == 0) {
            return str;
        }
        int len = str.length();
        char[] chArray = str.toCharArray();
        for(int i= 0; i< len/2; i++) {
            char temp;
            temp = chArray[i];
            chArray[i] = chArray[len- 1- i];
            chArray[len- 1- i] = temp;
        }
        return new String(chArray);
    }
    //用栈实现
    public String reverseByStack() {
        if(str == null || str.length() == 0) {
            return str;
        }
        Stack<Character> strStack = new Stack<Character>();
        char[] chArray = str.toCharArray();
        for(Character ch: chArray) {
            strStack.push(ch);
        }
        int len = str.length();
        for(int i= 0; i< len; i++) {
            chArray[i] = strStack.pop();
        }
        return new String(chArray);
    }
    //用逆序遍历实现
    public String reverseBySort() {
        if(str == null || str.length() == 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        for(int i= str.length()- 1; i>= 0; i--) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }
    //用位运算实现
    public String reverseByBit() {
        if(str == null || str.length() == 0) {
            return str;
        }
        char[] chArray = str.toCharArray();
        int len = str.length();
        for(int i= 0; i< len/ 2; i++) {
            chArray[i]^= chArray[len- 1- i];
            chArray[len- 1- i]^= chArray[i];
            chArray[i]^= chArray[len- 1- i];
        }
        return new String(chArray);
    }
    //用递归实现
    public String reverseByRecursive(String str) {
        if(str == null || str.length() == 0) {
            return str;
        }
        int len = str.length();
        if(len == 1) {
            return str;
        } else {
            return reverseByRecursive(str.substring(1))+ str.charAt(0);
        }
    }
}
