import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner in = new Scanner(System.in);
		ArrayList<ArrayList<Integer>> map = new ArrayList<ArrayList<Integer>>();
		while (in.hasNext()){
			String line = in.nextLine();
			String[] split = line.split(" ");
			ArrayList<Integer> subMap = new ArrayList<Integer>();
			for (int i = 0; i < split.length; i++){
				subMap.add(Integer.parseInt(split[i]));
			}
			map.add(subMap);
		}

//		for (int i = 0; i < map.size(); i++){
//			for (int a = 0; a < map.get(0).size(); a++){
//				System.out.print(map.get(i).get(a) + " ");
//			}
//			System.out.println();
//		}
		System.out.println(getBiggestHourGlass(map));
	}

	public static int getBiggestHourGlass(ArrayList<ArrayList<Integer>> map){
		int result = Integer.MIN_VALUE;
		for (int i = 1; i < map.size() - 1; i++){
			for (int a = 1; a < map.get(i).size() - 1; a++){
				int temp = map.get(i - 1).get(a - 1) + map.get(i - 1).get(a) + map.get(i - 1).get(a + 1) + map.get(i).get(a) + map.get(i + 1).get(a - 1)
						+ map.get(i + 1).get(a) + map.get(i + 1).get(a + 1);
				if (temp > result)
					result = temp;
			}
		}
		return result;
    }
}