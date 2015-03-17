import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
    int T = in.nextInt();
    long[] a = new long[T];
    for(int i=0;i<T;i++){
     a[i]=in.nextLong();
    }
    
    in.close();
    
    for(int i=0;i<a.length;i++){
     if(isFibo(a[i]))
      System.out.println("IsFibo");
     else
      System.out.println("IsNotFibo");
    }
    
   }
   
   static boolean isFibo(long a){
    long a1=(long)Math.sqrt(5*a*a +4);                
          long a2=(long)Math.sqrt(5*a*a -4);
          
          
          if((a1*a1)==(5*a*a +4) || (a2*a2)==(5*a*a -4))
              return true;
          else
              return false;
          
   }
}