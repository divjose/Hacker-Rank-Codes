//https://www.hackerrank.com/challenges/acm-icpc-team

import java.util.*;

public class ACM_ICPC_Team {
	public static void main(String arg[]){
		Scanner in=new Scanner(System.in);
		String input=in.nextLine();
		int a[]=new int[2];
		String[] splitArray = input.split(" ");
		for(int i=0;i<2;i++){
			a[i]=Integer.parseInt(splitArray[i]);
		}
		String line[]=new String[a[0]]; 
		for(int j=0;j<a[0];j++){
		   line[j]=in.nextLine();
		}
	    int maxscore=0;
	    int teammax=0;
		for(int k=0;k<a[0];k++){
			for(int m=k+1;m<a[0];m++){
				int teamscore=0;
				for(int t=0;t<a[1];t++){
					if( line[k].substring(t, t+1).equals("1") || line[m].substring(t, t+1).equals("1"))
						teamscore++;
				}
				if(teamscore>maxscore){
					maxscore=teamscore;
					teammax=1;
				}
				else if(teamscore==maxscore)
					teammax++;
			}
		}
		System.out.println(maxscore);
		System.out.println(teammax);
	}
}
