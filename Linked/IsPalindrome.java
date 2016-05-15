package Linked;

import java.util.Stack;

public class IsPalindrome {
	public boolean isPalindrome1(Node head){
		Stack<Integer> stack=new Stack<Integer>();
		Node cur=head;
		while(cur!=null){
			stack.push(head.value);
		head=head.next;
		}
		
		while(head!=null){
			if(head.value!=stack.pop()){
				return false;
			}
			head=head.next;
		}
		return true;
	}

}
