//https://www.hackerrank.com/challenges/chocolate-feast

import java.util.Scanner;

public class ChocFeast {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int numberOfTest = Integer.parseInt(in.nextLine());
		for(int i=0;i<numberOfTest;i++){
			String numbers[] = in.nextLine().split(" ");
			int dollar=Integer.parseInt(numbers[0]);
			int price= Integer.parseInt(numbers[1]);
			int wrapper= Integer.parseInt(numbers[2]);

			int Chocolates = dollar/price;
			int avlblWrapper = Chocolates;
			while(avlblWrapper>=wrapper){
				int newChocolates = avlblWrapper/wrapper;
				int reminder = avlblWrapper%wrapper;
				avlblWrapper = newChocolates+reminder;
				Chocolates+=newChocolates;
			}
			System.out.println(Chocolates);
		}	
	}
}
