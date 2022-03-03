/* LINK - https://www.hackerrank.com/challenges/java-string-tokens/problem?isFullScreen=true */

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String[] words =  s.split("[ ,'?._!@]");
        int count=0;
        for (int i=0; i<words.length; i++) if (!words[i].isEmpty() && words[i]!=" ") count++;                
        System.out.println(count);
        for (int i=0; i<words.length; i++){
            if (!words[i].isEmpty() && words[i]!=" "){
                System.out.println(words[i]);                
            }
        }
        scan.close();
    }
}

