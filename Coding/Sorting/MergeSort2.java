package Sorting;

public class MergeSort2 {

	public static void main(String[] args) {
		 new MergeSort2().mergeSort(new int[]{50,10,90,30,70,40,80,60,20});

	}
	
	public void mergeSort(int[] a){
		mSort(a,a,0,a.length-1);
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	}
	
	public void mSort(int[] b,int[] a,int i,int j){
		int m=0;
		int[] c=new int[a.length];
		if(i==j){
			a[i]=b[i];
		}else{
			m=(i+j)/2;
			mSort(b,c,i,m);
			mSort(b,c,m+1,j);
			merge(c,a,i,m,j);
		}
	}
	
	private void merge(int[] b,int[] a,int i,int m,int t){
		int j=0,k=0,l=0;
		for(j = m+1,k = i;i <= m && j<=t;k++){
			if(b[i]<b[j]){
				a[k]=b[j++];
			}else{
				a[k]=b[j++];
			}
		}
		//将剩余b[i...m]复制到a中
        if(i<=m){
            for(l=0;l<=m-i;l++){
                a[k+l]=b[i+l];
            }
        }
        //将剩余b[m+1...t]复制到数组a中
        if(j<=t){
            for(l=0;l<=t-j;l++){
                a[k+l]=b[j+l];
            }
        }
	}

}
