/* LINK - https://www.hackerrank.com/challenges/java-list/problem?isFullScreen=true */

import java.io.*;
import java.util.*;

public class Solution {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<Integer>();

        int n = scanner.nextInt();
        for (int i=0; i<n; i++){
            int element = scanner.nextInt();
            arr.add(i, element);
        }

        int q = scanner.nextInt();
        for (int i=0; i<q; i++){
            scanner.nextLine();
            
            String command = scanner.nextLine();
            if (command.equals("Insert")){
                int index = scanner.nextInt();
                int element = scanner.nextInt();
                arr.add(index, element);
            }
            else{
                int index = scanner.nextInt();
                arr.remove(index);
            }
        }
        
        for (int element : arr){
            System.out.print(element+" ");
        }
    }
}
