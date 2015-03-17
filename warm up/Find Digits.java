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
            String value = in.next();
            int res = 0;
            for (int j = 0; j < value.length(); j++){
                // convert char to int
                int digit = Character.getNumericValue(value.charAt(j));
                // convert string to int
                if (digit != 0 &&Integer.parseInt(value) % digit == 0){
                    res++;
                }
            }
            System.out.println(res);
        }
    }
}