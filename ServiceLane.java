//https://www.hackerrank.com/challenges/service-lane

import java.util.*;

public class ServiceLane {
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		String lanes=in.nextLine();
		String highway=lanes.split(" ")[0];
		String testcases = lanes.split(" ")[1];
		
		int high=Integer.parseInt(highway);
		int cases = Integer.parseInt(testcases);
		
		String widths=in.nextLine();
	    String w[]= widths.split(" ");
	    int wint[]=new int[w.length];
	    for(int i=0;i<w.length;i++){
	    	wint[i]=Integer.parseInt(w[i]);
	    }
	    for(int i=0;i<cases;i++){
	    	String input=in.nextLine();
	    	int one=Integer.parseInt(input.split(" ")[0]);
	    	int two=Integer.parseInt(input.split(" ")[1]);
	    	int newarray[] = Arrays.copyOfRange(wint, one, two+1);
	    	
	    	int min=newarray[0];
	    	int max=newarray[0];
	    	//find minimum of the sub array
	    	for(int j=0;j<newarray.length;j++){
	    		if(min>newarray[j])
	    			min=newarray[j];
	    	}
	    	System.out.println(min);
	    }
	}
}
