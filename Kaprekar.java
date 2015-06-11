//https://www.hackerrank.com/challenges/kaprekar-numbers

import java.util.*;

public class Kaprekar {
	public static void main(String arg[]){
		Scanner in= new Scanner(System.in);
		int low=Integer.parseInt(in.nextLine());
		int high= Integer.parseInt(in.nextLine());
		String digit;
		String length;
		long left=0;
		long right=0;
		List<Long> list=new ArrayList<Long>();
		for(long i=low;i<=high;i++){
			digit=Long.toString(i*i);
			int l = (digit.length()/2);
			String leftpart=digit.substring(0, l);
			String rightpart = digit.substring(l, digit.length());
			if(leftpart.length()>0)
				left = Long.parseLong(leftpart);
			right = Long.parseLong(rightpart);
			if((left+right)==i)
				list.add(i);
		}
		if(list.size()>0){
			for(int i=0;i<list.size();i++)
				System.out.print(list.get(i)+" ");
		}
		else
			System.out.print("INVALID RANGE");
	}
}
