package graph;

import java.util.LinkedList;
import java.util.Queue;

public class BreadFirstSearch {
	//创建一个标记数组
	private boolean[] marked;
    //起点
	private int s;
	
	public BreadFirstSearch(MyGraph G,int s){
		marked=new boolean[G.V()];
		this.s=s;
		//开始广度优先搜索
		bfs(G,s);
	}
	
	public void bfs(MyGraph G,int s2){
		//创建一个队列
		Queue<Integer> queue=new LinkedList<Integer>();
		//标记起点
		marked[s]=true;
		queue.add(s);
		System.out.println(s+" ");
		while(!queue.isEmpty()){
			//从队列中删除下一个节点
			int v=queue.poll();
			//将该节点的所有邻接点加入队列中
			for(int w:G.adj(v)){
				//如果没有标记就标记
				if(!marked[w]){
					marked[w]=true;
					System.out.println(w+" ");
					queue.add(w);
				}
			}
		}
	}

}
