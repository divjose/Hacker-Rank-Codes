//https://www.hackerrank.com/challenges/halloween-party

import java.util.*;

public class HalloweenParty {
	public static void main(String arg[]){
		Scanner in=new Scanner(System.in);
		int testcases=Integer.parseInt((in.nextLine()));
		for(int i=0;i<testcases;i++){
			long number= Long.parseLong((in.nextLine()));
			long h=1;
			long v=1;
			long lines=0;
			for(int j=2;j<number;j++){
				if(j%2==0){
					v+=1;
				}
				else{
					h+=1;
				}
			}
			lines=h*v;
			System.out.println(lines);
		}
	}
}
