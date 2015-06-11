//https://www.hackerrank.com/challenges/filling-jars

import java.util.*;

public class FillingTheJars {
	public static void main(String arg[]){
		Scanner in=new Scanner(System.in);
		String input=in.nextLine();
		int a[]=new int[2];
		long b[]=new long[3];
		long sum=0;
		long avg=0;
		String splitArray[] = input.split(" ");
		for(int i=0;i<2;i++)
			a[i]=Integer.parseInt(splitArray[i]);
		int jar[]=new int[a[0]];
		//System.out.println(Arrays.toString(jar));
		for(int i=0;i<a[1];i++){
			String line=in.nextLine();
			String sArray[] = line.split(" ");
			for(int j=0;j<3;j++){
				b[j]=Long.parseLong(sArray[j]);		
			}
			sum+=((b[1]-b[0])+1)*b[2]; 
		}
		avg=(long)Math.floor((sum/a[0]));
		System.out.println(avg);
	}
}

