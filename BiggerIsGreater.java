import java.util.*;

public class BiggerIsGreater {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testcases=Integer.parseInt(in.nextLine());

		for(int i=0;i<testcases;i++){
			char arr[]={};
			char a[]={};
			int flag=0;
			String input=in.nextLine();
			char[] charInput=input.toCharArray();
			for(int j=input.length()-1;j>0;j--){
				for(int k=j-1;k>=0;k--){
					if(charInput[j]>charInput[k]){
						flag=1;
						char temp = charInput[j];
						charInput[j] = charInput[k];
						charInput[k] = temp;
						arr=Arrays.copyOfRange(charInput, k+1, charInput.length);
						Arrays.sort(arr);
						a=Arrays.copyOfRange(charInput, 0, k+1);
						break;
					}
				}
				if(flag==1)
					break;
			}
			if(flag==1){
			String output2=new String(arr);
			String output1=new String(a);
			System.out.println(output1+output2);
			}
			else
				System.out.println("no answer");
		}
	}

}


