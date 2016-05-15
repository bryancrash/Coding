package Search;

import java.util.Arrays;

public class Binary_Search {

	public static void main(String[] args) {
		int[] nums = { 2, 5, 11, 3, 22, 6, 91, 13, 35, 4 };  
        //对数组进行排序  
        Arrays.sort(nums, 0, nums.length-1);  
        
        Binary_Search BinarySearch=new Binary_Search();
          
        int find = BinarySearch.search(nums,nums.length,5);  
          
        if (find != -1) {  
            System.out.println("找到数值于索引" + find);  
        } else {  
            System.out.println("找不到数值");   
        }  

	}
	
	public int search(int[] a,int n,int key){
		int low,mid,high;
		low=1;
		high=n;
		
		while(low<high){
			mid=(low+high)/2;
			if(a[mid]>key){
				high=mid-1;
			}else if(a[mid]<key){
				low=mid+1;
			}else{
				return mid;
			}
		}
		return -1;
	}

}
