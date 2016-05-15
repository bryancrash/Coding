package Linked;

import java.util.Stack;

public class isPalindrome2 {
	public boolean isPalindermo2(Node head){
		if(head==null||head.next==null){
			return true;
		}
		Node right=head.next;
		Node cur=head;
		while(cur.next!=null&&cur.next.next!=null){
			right=right.next;
			cur=cur.next.next;
		}
		Stack<Node> stack=new Stack<Node>();
		while(right!=null){
			stack.push(right);
			right=right.next;
		}
		while(!stack.isEmpty()){
			if(head.value!=stack.pop().value){
				return false;
			}
			head=head.next;
		}
		return true;
	}
}
