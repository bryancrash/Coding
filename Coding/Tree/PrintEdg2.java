package Tree;

public class PrintEdg2 {
	public void printEdge2(Node head){
		if(head==null){
			return;
		}
		System.out.println(head.value+" ");
		if(head.left!=null&&head.right!=null){
			printLeftEdge(head.left,true);
			printRightEdge(head.right,true);
		}else{
			printEdge2(head.left!=null?head.left:head.right);
		}
		System.out.println();
	}

	private void printRightEdge(Node h, boolean print) {
		if(h==null){
			return;
		}
		printRightEdge(h.left,print&&h.right==null?true:false);
		printRightEdge(h.right,print);
		if(print||(h.left==null&&h.right==null)){
			System.out.println(h.value);
		}
		
	}

	private void printLeftEdge(Node h, boolean print) {
		if(h==null){
			return;
		}
		if(print||(h.left==null&&h.right==null)){
			System.out.println(h.value+" ");
		}
		printLeftEdge(h.left,print);
		printLeftEdge(h.right,print&&h.left==null?true:false);
	}

}
