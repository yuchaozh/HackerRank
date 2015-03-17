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
            long numOfBlack = in.nextInt();
            long numOfWhite = in.nextInt();
            long costOfEachBlack = in.nextInt();
            long costOfEachWhite = in.nextInt();
            long costOfConvert = in.nextInt();
            System.out.println(helper(numOfBlack, numOfWhite, costOfEachBlack, costOfEachWhite, costOfConvert));
            
        }
    }
    
    public static long helper(long numOfBlack, long numOfWhite, long costOfEachBlack, long costOfEachWhite, long costOfConvert){
        // black >= white
        if (costOfEachBlack >= costOfEachWhite){
            if (costOfConvert + costOfEachWhite < costOfEachBlack){
                return ((numOfWhite + numOfBlack) * costOfEachWhite + (numOfBlack) * costOfConvert);
            }
            else{
                return (numOfWhite * costOfEachWhite + numOfBlack * costOfEachBlack);
            }
        }else{  // white > black
            if (costOfConvert + costOfEachBlack < costOfEachWhite){
                return ((numOfWhite + numOfBlack) * costOfEachBlack + (numOfWhite) * costOfConvert);
            }
            else{
                return (numOfWhite * costOfEachWhite + numOfBlack * costOfEachBlack);
            }
        }
    }
}