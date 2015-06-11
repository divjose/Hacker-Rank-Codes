//https://www.hackerrank.com/challenges/find-digits

import java.io.IOException;
import java.util.Scanner;

public class FindDigit {

	public static void main(String args[]) throws IOException{
		Scanner in = new Scanner(System.in);

		int numberOfTest = Integer.parseInt(in.nextLine());
		for(int i=0;i<numberOfTest;i++){
			int number= Integer.parseInt(in.nextLine());
			int length = (int) Math.log10(number) + 1;
			int n=0;
			int count=0;
			while(n<length){
				int f = Integer.parseInt(Integer.toString(number).substring(n, n+1));
				n++;
				if(f>0){
					if((number%f)==0){
						count++;
					}  
				}
			}
			System.out.println(count);
		}
	}
}
