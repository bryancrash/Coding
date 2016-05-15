package Sorting;

public class QuickSort3 {

	public static void main(String[] args) {
		new QuickSort3().quickSort(new int[]{50,10,90,30,70,40,80,60,10});

	}
	
	public void quickSort(int[] a){
		qSort(a,0,a.length-1);
		//打印输出
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
	}
	
	public void qSort(int[] a,int low,int high){
		int pivot=0;
		if(low<high){
			//将数组a一分为二
			pivot=partition(a,low,high);
			//对第一部分进行排序
			qSort(a,low,pivot);
			//对第二部分进行地柜排序
			qSort(a,pivot+1,high);
		}
	}
	
	private int partition(int[] a,int low,int high){
		//用第一个元素座位轴元素
		int pivotkey=a[low];
		while(low<high){
			//将比轴记录小的交换到低端
			while(low<high&&a[high]>=pivotkey){
				high--;
			}
			//将比轴记录大的交换到高端
			while(low<high&&a[low]<=pivotkey){
				low++;
			}
			swap(a,low,high);
		}
		//返回轴所在的位置
		return low;
	}
	
	public void swap(int[] a,int low,int high){
		int temp=a[low];
		a[low]=a[high];
		a[high]=temp;
	}

}
