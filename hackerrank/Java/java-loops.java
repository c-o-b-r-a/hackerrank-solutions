/* LIST - https://www.hackerrank.com/challenges/java-loops/problem?isFullScreen=true */

import java.util.*;

public class Solution {
    public static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int q = scanner.nextInt();

        while(q-->0){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();

            for (int i=1; i<=n; i++){
                int s = a + b*((int)Math.pow(2,i) - 1);
                System.out.print(s + " ");
            }
            System.out.print("\n");
        }
    }
}