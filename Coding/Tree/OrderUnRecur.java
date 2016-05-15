package Tree;

import java.util.Stack;

public class OrderUnRecur {
	public void preOrderUnRecur(Node head){
		System.out.println("pre-order");
		if(head!=null){
			Stack<Node> stack=new Stack<Node>();
			stack.add(head);
			while(!stack.isEmpty()){
				head=stack.pop();
				System.out.println(head.value+" ");
				if(head.right!=null){
					stack.push(head.right);
				}
				if(head.left!=null){
					stack.push(head.left);
				}
			}
		}
		System.out.println(); 
	}
	
	

}
