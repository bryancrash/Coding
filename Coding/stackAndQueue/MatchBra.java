package stackAndQueue;

import java.util.Stack;

public class MatchBra {

	public static void main(String[] args) {
		char[] input={'[','[','[','}',')',']'};
		
		Stack<Character> stack=new Stack<Character>();
		
		boolean result=true;
		for(int i=0;i<input.length;i++){
			switch(input[i]){
			case '[':
			case '{':
			case '(':
				stack.push(input[i]);
			default:
				if(stack.isEmpty()){
					break;
				}else{
					char top=stack.pop();
					
					if(input[i]==')'&&top!='('||input[i]==']'&&top!='['||input[i]=='}'&&top!='{'){
						result=false;
					}
					break;
				}
			}
		}
		if(!stack.isEmpty()){
			System.out.println("false");
		}else if(result){
			System.out.println("true");
		}else if(!result){
			System.out.println("false");
		}

	}

}
