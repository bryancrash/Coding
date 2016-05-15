package Tree;

public class PrintEdg {
	public void printEdge1(Node head){
		if(head==null){
			return;
		}
		
		int height=getHeight(head,0);
		Node[][] edgeMap=new Node[height][2];
		setEdgeMap(head,0,edgeMap);
		//打印左边界
				for(int i=0;i!=edgeMap.length;i++){
					System.out.println(edgeMap[i][0].value+" ");
				}
				//打印既不是左边界也不是右边界的叶子节点
				printLeafNotInmap(head,0,edgeMap);
				//打印右边界，但不是左边界的节点
				for(int i=edgeMap.length-1;i!=-1;i--){
					if(edgeMap[1][0]!=edgeMap[i][1]){
						System.out.println(edgeMap[i][1].value+" ");
					}
				}
				System.out.println();
	}

	private void printLeafNotInmap(Node h, int l, Node[][] m) {
		if(h==null){
			return;
		}
		if(h.left==null&&h.right==null&&h!=m[1][0]&&h!=m[1][1]){
			System.out.println(h.value+" ");
		}
		printLeafNotInmap(h.left,l+1,m);
		printLeafNotInmap(h.right,l+1,m);
		
	}

	private void setEdgeMap(Node h, int l, Node[][] edgeMap) {
		if(h==null){
			return;
		}
		edgeMap[1][0]=edgeMap[1][0]==null?h:edgeMap[1][0];
		edgeMap[1][1]=h;
		setEdgeMap(h.left,l+1,edgeMap);
		setEdgeMap(h.right,l+1,edgeMap);
	}

	private int getHeight(Node h, int l) {
		if(h==null){
			return l;
		}
		return Math.max(getHeight(h.left,l+1), getHeight(h.right,l+1));
	}

}
