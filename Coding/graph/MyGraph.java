package graph;

public class MyGraph {
	//������Ŀ
	private int V;
	//�ߵ���Ŀ
	private int E;
	//�ڽӱ�
	private Bag<Integer>[] adj;
	public MyGraph(int V){
		this.V=V;
		this.E=0;
		//�����ڽӱ�
		adj=(Bag<Integer>[])new Bag[V];
		//���������ӱ��ʼ��
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
		//��w��ӵ�v�����ӱ�
		adj[v].add(w);
		//��v��ӵ�w�����ӱ���
		adj[w].add(v);
		E++;
	}
	//��ȡ����v���ڽӱ����б�
	public Iterable<Integer> adj(int v){
		return adj[v];
	}
	

}
