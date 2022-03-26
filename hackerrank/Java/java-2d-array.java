/* LINK - https://www.hackerrank.com/challenges/java-2d-array/problem?isFullScreen=true */

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Solution {
    
    public static long pointsSum(List<List<Integer>> array, int i, int j) {
        long sum = 
                array.get(i-1).get(j-1) + array.get(i-1).get(j) + array.get(i-1).get(j+1) +
                array.get(i).get(j) +
                array.get(i+1).get(j-1) + array.get(i+1).get(j) + array.get(i+1).get(j+1);
        return sum;
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> arrRowItems = new ArrayList<>();

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowTempItems[j]);
                arrRowItems.add(arrItem);
            }

            arr.add(arrRowItems);
        }

        bufferedReader.close();
        
        long maxResult = pointsSum(arr, 1,1);
        
        for (int i=1; i<5; i++){
            for (int j=1; j<5; j++){
                long sum = pointsSum(arr, i, j);
                if (maxResult<sum){
                    maxResult = sum;
                }
            }
        }
        System.out.println(maxResult);
    }
}
