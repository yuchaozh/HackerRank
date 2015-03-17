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
            int numOfStones = in.nextInt();
            long a = in.nextLong();
            long b = in.nextLong();
            // if a is bigger than b, switch
            if (a > b){
                long tmp = a;
                a = b;
                b = tmp;
            }
            ArrayList<Long> res = new ArrayList<Long>();
            long min = a * (numOfStones - 1);
            long max = b * (numOfStones - 1);
            res.add(min);
            
            long tmp = min;
            for (int j = 0 ; j < numOfStones - 2; j++){
                tmp += b - a;
                // void duplicate when a == b
                if (!res.contains(tmp))
                    res.add(tmp);
            }
            if (!res.contains(max))
                res.add(max);
            for (int j = 0; j < res.size(); j++){
                System.out.print(res.get(j) + " ");
            }
            System.out.println();
        }
    }
}