package Dynamic;

import java.util.Queue;

public class Mixture {
	 public boolean chkMixture(String A, int n, String B, int m, String C, int v) {
	       if(n+m!=v&&n>100&&n>100&&v>100){
	           return false;
	       }else{
	           if(check(A,n,C,v)&&check(B,m,C,v)){
	               return true;
	           }
	       }
	        return false;
	    }
	    
	    public boolean check(String A,int n,String C,int v){
	        Queue queue=new Queue();
	        for(int i=0;i<v;i++){
	            queue.add(A.charAt(i));
	        }
	        int index=0;
	        while(queue.poll()!=null){
	            if(A[index]==queue.poll()){
	                index++;
	            }
	        }
	        if((index+1)==n){
	            return true;
	        }
	        return false;
	    }

}
