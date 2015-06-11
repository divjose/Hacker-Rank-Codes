//https://www.hackerrank.com/challenges/sherlock-and-the-beast

import java.util.*;
import java.lang.*;

public class SherlockAndtheBeast {
	public static void main(String arg[]){
		Scanner in= new Scanner(System.in);
		int testcases = in.nextInt();
		for(int i=0;i<testcases;i++){
			int n=in.nextInt();
			int noOf5=(n/3)*3;
			int noOf3=n-noOf5;
			while(noOf5>=0){
				if(noOf3%5==0){
					StringBuilder sb=new StringBuilder(n);
					for(int j=0;j<noOf5;j++){
						sb.append("5");
					}
					for(int j=0;j<noOf3;j++){
						sb.append("3");
					}
					System.out.println(sb);
					break;
				}
				else{
					noOf5-=3;
					noOf3=n-noOf5;
				}
			}
			if(noOf5<0)
				System.out.println("-1");
		}
	}
}
