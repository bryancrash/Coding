package graph;

public class MyGraph {
	//定点数目
	private int V;
	//边的数目
	private int E;
	//邻接表
	private Bag<Integer>[] adj;
	public MyGraph(int V){
		this.V=V;
		this.E=0;
		//创建邻接表
		adj=(Bag<Integer>[])new Bag[V];
		//将所有连接表初始化
		for(int v=0;v<V;v++){
			adj[v]=new Bag<Integer>();
		}
		
	}
	
	public int V(){
		return V;
	}
	
	public int E(){
		return E;
	}
	
	public void addEdge(int v,int w){
		//将w添加到v的链接表
		adj[v].add(w);
		//将v添加到w的链接表中
		adj[w].add(v);
		E++;
	}
	//获取顶点v的邻接表顶点列表
	public Iterable<Integer> adj(int v){
		return adj[v];
	}
	

}
