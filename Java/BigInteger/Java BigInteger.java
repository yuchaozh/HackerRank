import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner in = new Scanner(System.in);
		BigInteger first = in.nextBigInteger();
		BigInteger second = in.nextBigInteger();
		System.out.println(first.add(second));
		System.out.println(first.multiply(second));
    }
}