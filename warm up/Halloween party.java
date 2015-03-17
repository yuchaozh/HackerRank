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
            int input = in.nextInt();
            if (input % 2 == 0){
                System.out.println((long)Math.pow(input/2, 2));
            }
            else{
                System.out.println((long)Math.pow(input/2, 2) + input/2);
            }
        }
    }
}