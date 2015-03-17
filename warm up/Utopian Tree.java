import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        for (int i = 0; i < size; i++){
            int year = in.nextInt();
            System.out.println(calculate(year));
        }
    }
    /**
    public static int calculate(int year){
        boolean plus1 = true;
        int res = 0;
        for(int i = 0; i <= year; i++){
            if (plus1)
                res++;
            else
                res *= 2;
            plus1 = !plus1;
        }
        return res;
    }
    */
    
    public static int calculate(int year){
        int res = 1;
        for (int i = 1; i <= year; i++){
            if (i % 2 != 0)
                res *= 2;
            else
                res++;
        }
        return res;
    }
}