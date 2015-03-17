import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        for (int i = 0; i < size; i++){
            String s = in.next();
            int steps = 0;
            for (int j = 0; j < s.length() / 2; j++){
                steps += Math.abs(s.charAt(j) - s.charAt(s.length() - 1 - j));
            }
            System.out.println(steps);
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        /**
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        for (int i = 0; i < size; i++){
            // it is wrong to use String s = in.nextLine();
            String s = in.next();
            System.out.println(helper(s));
        }
    }
    
    public static int helper(String s){
        if (s.length() <= 1 || s == null)
            return 0;
        int left = 0;
        int right = s.length() - 1;
        int steps = 0;
        while (left < right){
            steps += Math.abs(s.charAt(left) - s.charAt(right));
            left++;
            right--;
        }
        return steps;
    }
    */
    } 
}