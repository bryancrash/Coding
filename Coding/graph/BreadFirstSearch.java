package graph;

import java.util.LinkedList;
import java.util.Queue;

public class BreadFirstSearch {
	//����һ���������
	private boolean[] marked;
    //���
	private int s;
	
	public BreadFirstSearch(MyGraph G,int s){
		marked=new boolean[G.V()];
		this.s=s;
		//��ʼ�����������
		bfs(G,s);
	}
	
	public void bfs(MyGraph G,int s2){
		//����һ������
		Queue<Integer> queue=new LinkedList<Integer>();
		//������
		marked[s]=true;
		queue.add(s);
		System.out.println(s+" ");
		while(!queue.isEmpty()){
			//�Ӷ�����ɾ����һ���ڵ�
			int v=queue.poll();
			//���ýڵ�������ڽӵ���������
			for(int w:G.adj(v)){
				//���û�б�Ǿͱ��
				if(!marked[w]){
					marked[w]=true;
					System.out.println(w+" ");
					queue.add(w);
				}
			}
		}
	}

}
