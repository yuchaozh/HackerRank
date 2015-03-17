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
            int left = in.nextInt();
            int right = in.nextInt();
            int res = (int)(Math.floor(Math.sqrt(right)) - Math.ceil(Math.sqrt(left))) + 1;
            System.out.println(res);
        }
    }
}