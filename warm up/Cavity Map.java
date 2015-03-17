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
        char[][] maps = new char[size][size];
        for (int i = 0; i < size; i++){
            String tmp = in.next();
            for (int j = 0; j < tmp.length(); j++){
                maps[i][j] = tmp.charAt(j);
            }
        }
        helper(maps);
        for (int i = 0; i < size; i++){
            for (int j = 0; j < size; j++){
                System.out.print(maps[i][j]);
            }
            System.out.println();
        }
    }
    
    public static void helper(char[][] maps){
        int size = maps.length;
        for (int i = 1; i < size - 1; i++){
            for (int j = 1; j < size - 1; j++){
                if (Character.getNumericValue(maps[i][j]) > Character.getNumericValue(maps[i][j - 1]) &&
                   Character.getNumericValue(maps[i][j]) > Character.getNumericValue(maps[i][j + 1]) &&
                   Character.getNumericValue(maps[i][j]) > Character.getNumericValue(maps[i - 1][j]) &&
                   Character.getNumericValue(maps[i][j]) > Character.getNumericValue(maps[i + 1][j])){
                    maps[i][j] = 'X';
                }
            }
        }
    }
}