//https://www.hackerrank.com/challenges/angry-professor

import java.util.*;

public class AngryProfessor {
	public static void main(String arg[]){
		Scanner in= new Scanner(System.in);
		int testcases = Integer.parseInt(in.nextLine());
		
		for(int i=0;i<testcases;i++){
			String input=in.nextLine();
			int inputArray[]=new int[2];
			String arraySplit[]=input.split(" ");
			for(int j=0;j<arraySplit.length;j++){
				inputArray[j]=Integer.parseInt(arraySplit[j]);
			}
			String students=in.nextLine();
			int instudents[]=new int[inputArray[0]];
			String inputStudent[]=students.split(" ");
			for(int k=0;k<inputStudent.length;k++){
				instudents[k]=Integer.parseInt(inputStudent[k]);
				
			}
			int count=0;
			for(int m=0;m<inputArray[0];m++){
				if(instudents[m]<=0){
					count++;		
				}
			}
			if(count>=inputArray[1]){
				System.out.println("NO");
			}
			else
				System.out.println("YES");	
		}
	}
}
