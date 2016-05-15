package Tree;

public class PreOrder {
	public void preOrderRecur(Node head){
		if(head==null){
			return;
		}
		System.out.println(head.value+" ");
	}

}
