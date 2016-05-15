package graph;

public class DepthFirstSearch {
	//创建一个标记数组
	private boolean[] marked;
	//访问计时器
	private int count;
	/**
	 * 构造一幅图并进行深度优先遍历
	 * G 读入的图
	 * S 开始遍历的顶点
	 */
	public DepthFirstSearch(MyGraph G,int s){
		marked=new boolean[G.V()];
		dfs(G,s);
	}
	
	public void dfs(MyGraph G,int s){
		marked[s]=true;
		count++;
		System.out.println(s+" ");
		for(int w:G.adj(s)){
			//如果没有访问过就继续遍历
			if(!marked[w]) dfs(G,w);
		}
	}
	
	public boolean[] getMarked(){
		return marked;
	}
	
	public int getCount(){
		return count;
	}
	

}
