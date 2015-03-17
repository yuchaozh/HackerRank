import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        BigInteger numberOfJars = in.nextBigInteger();
        int numberOfActions = in.nextInt();
        BigInteger total = BigInteger.ZERO;
        for (int i = 0; i < numberOfActions; i++){
            BigInteger left = in.nextBigInteger();
            BigInteger right = in.nextBigInteger();
            BigInteger num = in.nextBigInteger();
            //total += (right - left + 1) * num;
            total = total.add(num.multiply(right.subtract(left).add((new BigInteger("1")))));
        }
        System.out.println(total.divide(numberOfJars).toString());
    }
}