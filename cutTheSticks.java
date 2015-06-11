//https://www.hackerrank.com/challenges/cut-the-sticks

import java.util.*;

public class cutTheSticks {

	public static void main(String args[]) {
		Scanner in= new Scanner(System.in);
		int n =Integer.parseInt(in.nextLine());
		int min;
		String input=in.nextLine();
		List<Integer> number=new ArrayList<Integer>();
		String a[]= input.split(" ");
		for(int i=0;i<n;i++){
			number.add(Integer.parseInt(a[i]));
		}
		while(number.size()>0){
			min=Collections.min(number);
			System.out.println(number.size());
			for(int j=0;j<number.size();j++){
				number.set(j,number.get(j)-min);
			}
			number.removeAll(Collections.singleton(0));
		}
	}
}



