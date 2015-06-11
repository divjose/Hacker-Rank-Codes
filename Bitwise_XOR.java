//https://www.hackerrank.com/challenges/lonely-integer

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Bitwise_XOR{
   static int lonelyinteger(int[] a) {
      int result = 0;
        for(int i=0;i<a.length;i++){
            result = result ^ a[i];
            System.out.print(result);
        }
        return result;
 
    }
   public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res;
        
        int numberOfIntegers = Integer.parseInt(in.nextLine());
        int[] numbers = new int[numberOfIntegers];
        int number_item;
        String next = in.nextLine();
        String[] next_split = next.split(" ");
        System.out.println(Arrays.toString(next_split));
        
        for(int i = 0; i < numberOfIntegers; i++) {
            number_item = Integer.parseInt(next_split[i]);
            numbers[i] = number_item;
        }
        
        res = lonelyinteger(numbers);
        System.out.println(res);
        
    }
}
