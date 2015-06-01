import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.math.BigInteger;

public class Solution {
    public final static BigInteger base = new BigInteger("2");
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        for (int i = 0; i < size; i++){
            BigInteger input = in.nextBigInteger();
			if (checkByte(input)){
				System.out.println(input.toString() + " can be fitted in:");
				System.out.println("* byte");
				System.out.println("* short");
				System.out.println("* int");
				System.out.println("* long");
			} else if (checkShort(input)){
				System.out.println(input.toString() + " can be fitted in:");
				System.out.println("* short");
				System.out.println("* int");
				System.out.println("* long");
			} else if (checkInt(input)){
				System.out.println(input.toString() + " can be fitted in:");
				System.out.println("* int");
				System.out.println("* long");
			} else if (checkLong(input)){
				System.out.println(input.toString() + " can be fitted in:");
				System.out.println("* long");
			} else {
				System.out.println(input.toString() + " can't be fitted anywhere.");
			}
        }
    }
    
	public static boolean checkByte(BigInteger input){
		BigInteger left = base.pow(7).negate();
		BigInteger right = base.pow(7).subtract(BigInteger.ONE);
		if ((input.compareTo(left) == 1 || input.compareTo(left) == 0) && input.compareTo(right) == -1 || input.compareTo(right) == 0){
			return true;
		}
		return false;
	}

	public static boolean checkShort(BigInteger input){
		BigInteger left = base.pow(15).negate();
		BigInteger right = base.pow(15).subtract(BigInteger.ONE);
		if ((input.compareTo(left) == 1 || input.compareTo(left) == 0) && input.compareTo(right) == -1 || input.compareTo(right) == 0){
			return true;
		}
		return false;
	}

	public static boolean checkInt(BigInteger input){
		BigInteger left = base.pow(31).negate();
		BigInteger right = base.pow(31).subtract(BigInteger.ONE);
		if ((input.compareTo(left) == 1 || input.compareTo(left) == 0) && input.compareTo(right) == -1 || input.compareTo(right) == 0){
			return true;
		}
		return false;
	}

	public static boolean checkLong(BigInteger input){
		BigInteger left = base.pow(63).negate();
		BigInteger right = base.pow(63).subtract(BigInteger.ONE);
		if ((input.compareTo(left) == 1 || input.compareTo(left) == 0) && input.compareTo(right) == -1 || input.compareTo(right) == 0){
			return true;
		}
		return false;
	}
}