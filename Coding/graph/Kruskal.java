package graph;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 * ��С������kruskal�㷨�����Ƚ�ÿ��������Ϊһ��ɭ�֣�����Ƚϸö�����ڽӱߣ�
 * ÿ��ȡ��СȨֵ���ڽӱߣ������ڽӱ����ӵĶ�����ԭ�ȶ��㹹��һ����������Ѱ��
 * ��һ�����㣬���������ڽӱ�Ȩֵ������бȽϣ�ȡȨֵ��С�Ĺ�����...
 *
 *������һ��Edge�๹��һ���ڽӱߵ���Ϣ�������ڽӱߵ���ʼ������������㣬Ȩֵ��
 * ����Edge��������¼�������Ϣ�����ն����Ȩֵ���бȽϣ����������Ķ������
 * �������У����հ�������˳�������С��������
 */

public class Kruskal {
	/**
	 * 
	 * Max:���嶥����������ֵ
  * edge:����edge���洢�����Edge����
  * target:����trget,�洢���յõ������Edge����
  * parent:�洢������Ϣ������
  * n:������
  */
	
	int Max=100;
	ArrayList<Edge> edge=new ArrayList<Edge>();
	ArrayList<Edge> target=new ArrayList<Edge>();
	int[] parent=new int[Max];
	Float TheMax=Float.MAX_VALUE;
	int n;
	
	public void init(){
		Scanner scan=new Scanner(System.in);
		int p,q;
		double w;
		System.out.println("������ڵ�ĸ���:");
		n=scan.nextInt();
		System.out.println("���ա�A,B,C���ĸ�ʽ�������ߵ���Ϣ��ABC�ֱ����ߵ���ʼ���㣬�������㣬Ȩֵ(����-1-1-1��������)");
		while(true){
			p=scan.nextInt();
			q=scan.nextInt();
			w=scan.nextDouble();
			if(p<0||q<0||w<0){
				break;
			}
			Edge e=new Edge();
			e.start=p;
			e.weight=w;
			edge.add(e);
			for(int i=1;i<=n;++i){
				parent[i]=i;
			}
		}
	}
		
		public void union(int j,int k){
			for(int i=1;i<n;i++){
				if(parent[i]==j){
					parent[i]=k;
				}
			}
		}
	
	
	public void kruskal(){
		int i=0;
		while(i<n-1&&edge.size()>0){
			double min=Double.MAX_VALUE;
			Edge temp=null;
			for(int j=0;j<edge.size();++j){
				Edge tt=edge.get(j);
				if(tt.weight<min){
					min=tt.weight;
					temp=tt;
				}
			}
		
	
	
	int jj=parent[temp.start];
	int kk=parent[temp.end];
	
	if(jj!=kk){
		++i;
		target.add(temp);
		union(jj,kk);
	}
	edge.remove(temp);
	}
		System.out.println("��С��������·����:");
		for(int k=0;k<target.size();++k){
			Edge e=target.get(k);
			System.out.println(e.start+"-->"+e.end);
		}
	}
	

	public static void main(String[] args) {
		 Kruskal kr=new  Kruskal();
		   kr.init();
		   kr.kruskal();

	}

}
