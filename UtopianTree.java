//https://www.hackerrank.com/challenges/utopian-tree

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class UtopianTree {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCaseNumber = in.nextInt();
		for(int i=0;i<testCaseNumber;i++){
			int cycle =  in.nextInt();
			System.out.println(calculateGrowth(cycle));
		}
	}
	public static int calculateGrowth(int a){
		int height =1;
		if(a==0)
			return 1;
		for(int i=1;i<=a;i++)
		{
			if(i%2==0)
				height= height+1;
			else
				height= height*2;
		}
		return height;
	}
}


