package Sorting;

public class QuickSort3 {

	public static void main(String[] args) {
		new QuickSort3().quickSort(new int[]{50,10,90,30,70,40,80,60,10});

	}
	
	public void quickSort(int[] a){
		qSort(a,0,a.length-1);
		//��ӡ���
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
	}
	
	public void qSort(int[] a,int low,int high){
		int pivot=0;
		if(low<high){
			//������aһ��Ϊ��
			pivot=partition(a,low,high);
			//�Ե�һ���ֽ�������
			qSort(a,low,pivot);
			//�Եڶ����ֽ��еع�����
			qSort(a,pivot+1,high);
		}
	}
	
	private int partition(int[] a,int low,int high){
		//�õ�һ��Ԫ����λ��Ԫ��
		int pivotkey=a[low];
		while(low<high){
			//�������¼С�Ľ������Ͷ�
			while(low<high&&a[high]>=pivotkey){
				high--;
			}
			//�������¼��Ľ������߶�
			while(low<high&&a[low]<=pivotkey){
				low++;
			}
			swap(a,low,high);
		}
		//���������ڵ�λ��
		return low;
	}
	
	public void swap(int[] a,int low,int high){
		int temp=a[low];
		a[low]=a[high];
		a[high]=temp;
	}

}
