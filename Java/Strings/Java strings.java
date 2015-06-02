import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * String substring(inclusive, exclusive)
 */
public class Solution {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner in  = new Scanner(System.in);
		String input = in.nextLine();
		int size = in.nextInt();
		String smallest = input.substring(0, size);
		String biggest = smallest;
		for (int i = 1; i < input.length() - size + 1; i++){
			String tmp = input.substring(i, size + i);
			if (tmp.compareTo(smallest) < 0)
				smallest = tmp;
			if (tmp.compareTo(biggest) > 0)
				biggest = tmp;
		}
		System.out.println(smallest);
		System.out.println(biggest);
    }
}