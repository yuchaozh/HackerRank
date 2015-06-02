import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner in = new Scanner(System.in);
		in.nextLine();
		HashSet<String> dictionary = new HashSet<String>();
		while (in.hasNext()){
			String input = in.nextLine();
			dictionary.add(input);
			System.out.println(dictionary.size());
		}
    }
}