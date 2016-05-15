package stackAndQueue;

import java.util.Stack;

public class SortStack {
	Stack<Integer> help=new Stack<Integer>(); 
	public void sortStackByStack(Stack<Integer> stack){
		while(!stack.isEmpty()){
			int cur=stack.pop();
			while(!help.isEmpty()&&cur>help.peek()){
				stack.push(help.pop());
			}
			help.push(cur);
		}
		while(!help.isEmpty()){
			stack.push(help.pop());
		}
	}

}
