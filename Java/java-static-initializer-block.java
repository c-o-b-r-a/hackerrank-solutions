/* LINK - https://www.hackerrank.com/challenges/java-static-initializer-block/problem?isFullScreen=true */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

static Scanner scanner = new Scanner(System.in);

static int B = scanner.nextInt();
static int H = scanner.nextInt();

static boolean flagFunction(){
    if ((B>0) && (H>0)) return true;
    System.out.println("java.lang.Exception: Breadth and height must be positive");
    return false;
};
static boolean flag = flagFunction();

public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}	
	}
}