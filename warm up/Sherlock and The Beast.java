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
            int digits = in.nextInt();
            System.out.println(helper(digits));
        }
    }
    
    public static String helper(int digits){
        StringBuffer res = new StringBuffer();
        // digits < 3
        if (digits / 3 == 0){
            return "-1";
        }
        // digits >= 3
        if (digits % 3 == 0){
            for (int i = 0; i < digits / 3; i++){
                res.append("555");
            }
            return res.toString();
        }
        else{
            int left = digits / 3;
            int right = 0;
            int times = left;
            for (int i = 0; i <= times; i++){
                if ((digits - 3 * left) % 5 == 0){
                    right = (digits - 3 * left) / 5;
                    break;
                }
                left--;
            }
            if (left <= 0 && right == 0)
                return "-1";
            for (int i = 0; i < left; i++){
                res.append("555");
            }
            for (int i = 0; i < right; i++){
                res.append("33333");
            }
        }
        return res.toString();
    }
}