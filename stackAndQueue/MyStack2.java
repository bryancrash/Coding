package stackAndQueue;

import java.util.Stack;

public class MyStack2 {
	private Stack<Integer> stackData;
	private Stack<Integer> stackMin;
	
	public MyStack2(){
		this.stackData=new Stack<Integer>();
		this.stackMin=new Stack<Integer>();
	}
	
	public void push(int num){
		if(this.stackMin.isEmpty()){
			this.stackMin.push(num);
		}else if(num<=this.getMin()){
			this.stackMin.push(num);	
		}else{
			int newMin=this.stackMin.peek();
			this.stackMin.push(newMin);
		}
	}
	
	public int pop(){
		if(this.stackMin.isEmpty()){
			throw new RuntimeException("Your stack is empty");
		}
		this.stackMin.pop();
		return this.stackData.pop();
	}

	private int getMin() {
		if(this.stackMin.isEmpty()){
			throw new RuntimeException("Your stack is empty");
		}
		return this.stackMin.peek();
	}
}
