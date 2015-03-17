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
            int numOfStudents = in.nextInt();
            int target = in.nextInt();
            int[] data = new int[numOfStudents];
            for (int j = 0; j < numOfStudents; j++){
                int tmp = in.nextInt();
                if (tmp <= 0){
                    target--;
                }
            }
            if (target <= 0){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }
        }
    }
}