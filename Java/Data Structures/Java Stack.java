import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner in = new Scanner(System.in);
		while (in.hasNext()){
			String tmp = in.nextLine();
			Stack<Character> stack = new Stack();
			stack.push(tmp.charAt(0));
			for (int i = 1; i < tmp.length(); i++){
				if (!stack.isEmpty()){
					char top = stack.peek();
					if (tmp.charAt(i) == ')' && top == '(')
						stack.pop();
					else if (tmp.charAt(i) == ']' && top == '[')
						stack.pop();
					else if (tmp.charAt(i) == '}' && top == '{')
						stack.pop();
					else
						stack.push(tmp.charAt(i));
				}else{
					stack.push(tmp.charAt(i));
				}
			}
			System.out.println(stack.isEmpty());
		}
    }
}