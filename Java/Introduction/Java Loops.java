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
			int a = in.nextInt();
			int b = in.nextInt();
			int n = in.nextInt();
			int previous = a;
			for (int z = 0; z < n; z++){
				previous = previous + ((int)Math.pow(2, z) * b);
				System.out.print(previous + " ");
			}
			System.out.println();
		}
    }
}