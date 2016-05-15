package stackAndQueue;

import java.util.Stack;

public class MyStack1 {
		private Stack<Integer> stackData;
		private Stack<Integer> stackMin;
		
		public MyStack1(){
			this.stackData=new Stack<Integer>();
			this.stackMin=new Stack<Integer>();
		}
		
		public void push(int num){
			if(this.stackMin.isEmpty()){
				this.stackMin.push(num);
			}else if(num<this.getMin()){
				this.stackMin.push(num);
			}
			this.stackData.push(num);
		}
		
		public int pop(){
			if(this.stackMin.isEmpty()){
				throw new RuntimeException("Your stack is empty");
			}
			int value=this.stackData.pop();
			if(value==this.getMin()){
				this.stackMin.pop();
			}
			return value;
		}

		private int getMin() {
			if(this.stackMin.isEmpty()){
				throw new RuntimeException("Your stack is empty");
			}
			return this.stackMin.peek();
		}

}
