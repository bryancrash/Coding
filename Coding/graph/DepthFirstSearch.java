package graph;

public class DepthFirstSearch {
	//����һ���������
	private boolean[] marked;
	//���ʼ�ʱ��
	private int count;
	/**
	 * ����һ��ͼ������������ȱ���
	 * G �����ͼ
	 * S ��ʼ�����Ķ���
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
			//���û�з��ʹ��ͼ�������
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
