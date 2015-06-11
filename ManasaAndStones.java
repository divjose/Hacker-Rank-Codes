//https://www.hackerrank.com/challenges/manasa-and-stones

import java.util.*;

public class ManasaAndStones{
	public static void main(String arg[]){
		Scanner in = new Scanner(System.in);
		int testcases= Integer.parseInt(in.nextLine());
		for(int i=0;i<testcases;i++){
			int stones = Integer.parseInt(in.nextLine());
			int a =  Integer.parseInt(in.nextLine());
			int b =  Integer.parseInt(in.nextLine());
			Set<Integer> sum=new HashSet<Integer>();
			for(int j=0;j<stones;j++){
				 sum.add(a*(stones-(j+1))+b*(j));
			}
			List sortedList = new ArrayList(sum);
			Collections.sort(sortedList);
			for(int j=0;j<sortedList.size();j++){
				System.out.print(sortedList.get(j)+" ");
			}
			System.out.println();
		}
	}
}

