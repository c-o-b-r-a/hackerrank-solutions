/* LINK - https://www.hackerrank.com/challenges/java-currency-formatter/problem?isFullScreen=true */

import java.util.*;
import java.text.*;
import java.lang.Math;
public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        payment =  Math.round(payment * 100.0) / 100.0;
        
        
        NumberFormat formatterUS = NumberFormat.getCurrencyInstance(Locale.US);
        String us = formatterUS.format(payment);
        
        NumberFormat formatterINDIA = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));      
        String india = formatterINDIA.format(payment);
        
        NumberFormat formatterCHINA = NumberFormat.getCurrencyInstance(Locale.CHINA);        
        String china = formatterCHINA.format(payment);

        NumberFormat formatterFRANCE = NumberFormat.getCurrencyInstance(Locale.FRANCE);        
        String france = formatterFRANCE.format(payment);
        
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
