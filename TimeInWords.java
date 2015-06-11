//https://www.hackerrank.com/challenges/the-time-in-words

import java.util.*;

public class TimeInWords {
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		int hour= Integer.parseInt(in.nextLine());
		int min=Integer.parseInt(in.nextLine());

		String hours[]={"one","two","three","four","five","six","seven","eight",
				"nine","ten","eleven","twelve"};

		String mins[]={"one","two","three","four","five","six","seven", "eight", "nine", "ten",
				"eleven", "twelve", "thirteen", "fourteen", "quarter", "sixteen", "seventeen", "eighteen", "nineteen", "twenty",
				"twenty one", "twenty two", "twenty three", "twenty four", "twenty five","twenty six","twenty seven", "twenty eight", "twenty nine", "half"};
		
		if(min==0){
			System.out.println(hours[hour-1]+" o' clock");
		}
		if(min<=30){
			if(min==1)
				System.out.println(mins[min-1] + "minute past " + hours[hour-1]);
			else if(min==30 || min==15)
				System.out.println(mins[min-1] + " past " + hours[hour-1]);
			else
				System.out.println(mins[min-1] + " minutes past " + hours[hour-1]);
		}
		if(min>30 && min!=45)
			System.out.println(mins[(60-min-1)]+ " minutes to " + hours[hour]);
		if(min==45)
			System.out.println(mins[(60-min-1)]+ " to " + hours[hour]);
	}
}
