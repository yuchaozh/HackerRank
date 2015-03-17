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
        int[] data = new int[size];
        for (int i = 0; i < size; i++){
            data[i] = in.nextInt();
        }
        Arrays.sort(data);
        int index = 0;
        int counts = size;
        while (true){
            int cut = data[index];
            for (int i = index; i < size; i++){
                data[i] -= cut;
            }
            System.out.println(counts);
            while (data[index] == 0){
                index++;
                counts--;
            }
            if (data[size - 1] == 0){
                break;
            }
        }
    }
}