import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int sizeOfArray = in.nextInt();
        int size = in.nextInt();
        int[] data = new int[sizeOfArray];
        for (int i = 0; i < sizeOfArray; i++){
            data[i] = in.nextInt();
        }
        for (int i = 0; i < size; i++){
            int start = in.nextInt();
            int end = in.nextInt();
            int min = 3;
            for (int j = start; j <= end; j++){
                if (min > data[j]){
                    min = data[j];
                }
            }
            System.out.println(min);
        }
    }
}