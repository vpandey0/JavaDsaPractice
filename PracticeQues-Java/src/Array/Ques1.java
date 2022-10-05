package Array;

import java.util.Iterator;

public class Ques1 {
	public static void pushZerosAtEnd(int[] arr) {
    	//Your code goes here
        int i=0,j=0;
        
        while(i<arr.length){
            
            if(arr[i]!=0){
              int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j++;
                
            }
            else{
                i++;
            }
            
        }  
        
    }
	public static void main(String []args) {
		
		int arr[]= {5,5,0,0,1,2};
		pushZerosAtEnd(arr);
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
	}
		
	}

}
