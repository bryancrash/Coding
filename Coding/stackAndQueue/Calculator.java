package stackAndQueue;

import java.util.Collections;
import java.util.Stack;

public class Calculator {
	private Stack<String> postfixStack=new Stack<String>();
	private Stack<Character> opStack=new Stack<Character>();
	private int[] operatPriority=new int[]{0,3,2,1,-1,1,0,2};
	
	public static void main(String[] args){
		System.out.println(5+12*(3+5)/7.0);
		Calculator cal=new Calculator();
		String s="5+12*(3+5)/7";
		double result=cal.calculate(s);
		System.out.println(result);
	}
	
	public double calculate(String expression){
		Stack<String> resultStak=new Stack<String>();
		prepare(expression);
		Collections.reverse(postfixStack);
		String firstValue,secondVlaue,currentValue;
		
		while
	}
	
	public void prepare(String expression){
		opStack.push(',');
		char[] arr=expression.toCharArray();
		int currentIndex=0;
		int count=0;
		char currentOp,peekOp;
		for(int i=0;i<arr.length;i++){
			currentOp=arr[i];
			if(isOperator(currentOp)){
				if(count>0){
					postfixStack.push(new String(arr,currentIndex,count));
				}
				peekOp=opStack.peek();
				if(currentOp==')'){
					while(opStack.peek()!='('){
						postfixStack.push(String.valueOf(opStack.pop()));
						
					}
					opStack.pop();
				}else{
					while(currentOp!='('&&peekOp!=','&&compare(currentOp,peekOp)){
						 postfixStack.push(String.valueOf(opStack.pop()));
						 peekOp = opStack.peek();
					}
					
				}
			}
		}
	}

	private boolean compare(char currentOp, char peekOp) {
		// TODO Auto-generated method stub
		return false;
	}

}
