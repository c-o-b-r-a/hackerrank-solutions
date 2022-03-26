/* LINK - https://www.hackerrank.com/challenges/java-anagrams/problem?isFullScreen=true */

import java.util.Scanner;

public class Solution {
    
    static String sortString(String a){
        a = a.toLowerCase();
        for (int i=0; i<a.length(); i++){
            char ch = a.charAt(i);
            for (int j=0; j<i; j++){
                if (ch<=a.charAt(j)){
                    a = a.substring(0, i) + a.substring(i+1);
                    a = a.substring(0,j) + ch + a.substring(j);
                    break;
                }
            }
        }
        return a;
    }
    
    static boolean isAnagram(String a, String b) {
        if (sortString(a).equals(sortString(b))){
            return true;   
        }
        return false;
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}