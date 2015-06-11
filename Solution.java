import java.util.*;

public class Solution {
	public static void main(String arg[]){
		Scanner in=new Scanner(System.in);
		String input=in.nextLine();
		
		Stack<String> st=new Stack<String>();
		
		//for(int n=0;n<input.length();n++){
			if(input.contains("/")){
				int division_index=input.indexOf("/");
				//double left_operand=leftOperand(input.substring(0, division_index));
				int last_operator_index = lastOperatorIndex(input.substring(0, division_index));

				double left_operand = Double.parseDouble(input.substring(last_operator_index+1, division_index));
				
				int next_operator_index = nextOperatorIndex(input.substring(division_index+1, input.length()));
				double right_operand = 0;
				if(next_operator_index == 100){
					right_operand = Double.parseDouble(input.substring(division_index+1, input.length()));
					String division_answer=Double.toString(left_operand/right_operand);
					input=input.substring(0, last_operator_index+1) + division_answer;
				}
				else{
					right_operand = Double.parseDouble(input.substring(division_index+1, division_index+1+next_operator_index));
				
				//double right_operand=leftOperand(input.substring(0, division_index));
				String division_answer=Double.toString(left_operand/right_operand);
				input=input.substring(0, last_operator_index+1) + division_answer + 
						input.substring(next_operator_index, input.length()) ;
			}}
			
			if(input.contains("*")){
				int mul_index=input.indexOf("*");
				//int left_operand=Integer.parseInt(input.substring(mul_index-1, mul_index));
				//int right_operand=Integer.parseInt(input.substring(mul_index+1, mul_index+2));
				int last_operator_index = lastOperatorIndex(input.substring(0, mul_index));
				double left_operand = Double.parseDouble(input.substring(last_operator_index+1, mul_index));
				
				int next_operator_index = nextOperatorIndex(input.substring(mul_index+1, input.length()));
				double right_operand;
				if(next_operator_index == 100){
					right_operand = Double.parseDouble(input.substring(mul_index+1, input.length()));
					String mul_answer=Double.toString(left_operand/right_operand);
					input=input.substring(0, last_operator_index+1) + mul_answer;
				}
					else{
					right_operand = Double.parseDouble(input.substring(mul_index+1, mul_index+1+next_operator_index));
				
				String mul_answer=Double.toString(left_operand/right_operand);
				input=input.substring(0, last_operator_index+1) + mul_answer + 
						input.substring(next_operator_index, input.length()) ;
			}}
			
			if(input.contains("+")){
				int add_index=input.indexOf("+");
				//int left_operand=Integer.parseInt(input.substring(add_index-1, add_index));
				//int right_operand=Integer.parseInt(input.substring(add_index+1, add_index+2));
				
				int last_operator_index = lastOperatorIndex(input.substring(0, add_index));

				double left_operand = Double.parseDouble(input.substring(last_operator_index+1, add_index));
				
				int next_operator_index = nextOperatorIndex(input.substring(add_index+1, input.length()));
				double right_operand;
				if(next_operator_index == 100){
					right_operand = Double.parseDouble(input.substring(add_index+1, input.length()));
					String add_answer=Double.toString(left_operand/right_operand);
					input=input.substring(0, last_operator_index+1) + add_answer;
				
				}
					else{
					right_operand = Double.parseDouble(input.substring(add_index+1, add_index+1+next_operator_index));
				
				String add_answer=Double.toString(left_operand/right_operand);
				input=input.substring(0, last_operator_index+1) + add_answer + 
						input.substring(next_operator_index, input.length()) ;
			}}
			if(input.contains("-")){
				int sub_index=input.indexOf("-");
				//int left_operand=Integer.parseInt(input.substring(sub_index-1, sub_index));
				//int right_operand=Integer.parseInt(input.substring(sub_index+1, sub_index+2));
				
				int last_operator_index = lastOperatorIndex(input.substring(0, sub_index));

				double left_operand = Double.parseDouble(input.substring(last_operator_index+1, sub_index));
				
				int next_operator_index = nextOperatorIndex(input.substring(sub_index+1, input.length()));
				double right_operand;
				if(next_operator_index == 100){
					right_operand = Double.parseDouble(input.substring(sub_index+1, input.length()));
					next_operator_index = input.length();
					String sub_answer=Double.toString(left_operand/right_operand);
					input=input.substring(0, last_operator_index+1) + sub_answer;
				
				}
				else{
					right_operand = Double.parseDouble(input.substring(sub_index+1, sub_index+1+next_operator_index));
				
				String sub_answer=Double.toString(left_operand/right_operand);
				input=input.substring(0, last_operator_index+1) + sub_answer + 
						input.substring(next_operator_index, input.length()) ;
				}
			}
			
			
			double answer=Double.parseDouble(input);
			
			if(answer==Math.floor(answer)){
				System.out.println((int)answer);
			}
			else
				System.out.println(answer);
	//}
	}
	
	public static int lastOperatorIndex(String expression){
		int last_operator_index = Math.max(expression.lastIndexOf('+'),
				Math.max(expression.lastIndexOf('-'),
				Math.max(expression.lastIndexOf('*'),
				expression.lastIndexOf('/'))));
		return last_operator_index;
	}
	
	public static int nextOperatorIndex(String expression){
		int add_index = expression.indexOf('+') == -1 ? 100 : expression.indexOf('+');
		int sub_index = expression.indexOf('-') == -1 ? 100 : expression.indexOf('-');
		int mul_index = expression.indexOf('*') == -1 ? 100 : expression.indexOf('*');
		int div_index = expression.indexOf('/') == -1 ? 100 : expression.indexOf('/');
		
		
		int first_operator_index = Math.min(add_index,
				Math.min(sub_index,
				Math.min(mul_index,
				div_index)));
		
		return first_operator_index;
	}
	

}
