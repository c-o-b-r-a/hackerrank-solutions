/* LINK - https://www.hackerrank.com/challenges/java-output-formatting/problem?isFullScreen=true */

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            int numberLength = String.valueOf(x).length();
            System.out.println(s1+" ".repeat(15-s1.length())+"0".repeat(3-numberLength)+x);
        }
        
        System.out.println("================================");
    }
}