import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner in  = new Scanner(System.in);
		int size = in.nextInt();
		/**
		 * Thats because the Scanner#nextInt method does not read the last newline character of your input,
		 * and thus that newline is consumed in the next call to Scanner#nextLine
		 * another solution is use nextline() to replace nextInt() and use Integer.parseInt() to get int from string
		 */
		in.nextLine();
		HashMap<String, String> phoneBook = new HashMap<String, String>();
		for (int i = 0; i < size; i++){
			String name = in.nextLine();
			String phoneNumber = in.nextLine();
			phoneBook.put(name, phoneNumber);
		}
		while (in.hasNext())
		{
			String query = in.nextLine();
			if (phoneBook.containsKey(query)){
				System.out.println(query + "=" + phoneBook.get(query));
			}else{
				System.out.println("Not found");
			}

		}
    }
}