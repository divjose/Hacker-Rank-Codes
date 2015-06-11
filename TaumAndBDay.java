//https://www.hackerrank.com/challenges/taum-and-bday

import java.util.*;

public class TaumAndBDay {
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		int input=Integer.parseInt(in.nextLine());
		long n[]=new long[2];
		long p[]=new long[3];
		long total=0;
		for(int i=0;i<input;i++){
			String blackwhite = in.nextLine();
			String[] splitArray = blackwhite.split(" ");
			for(int j=0;j<2;j++){
				n[j]=Integer.parseInt(splitArray[j]);
			}
			String price = in.nextLine();
			String[] sArray = price.split(" ");
			for(int k=0;k<3;k++){
				p[k]=Integer.parseInt(sArray[k]);
			}
			if (p[0]<p[1]){
				total = n[0]*p[0];
				if(p[1]<(p[0]+p[2]))
					total = total+ (p[1]*n[1]);
				else
					total+= (p[0]+p[2]) * n[1];
			}
			else {
				total = n[1]*p[1];
				if(p[0]<(p[1]+p[2]))
					total+= (p[0] * n[0]);
				else
					total+= (p[1]+p[2]) * n[0];
			}
			System.out.println(total);
		}

	}
}
