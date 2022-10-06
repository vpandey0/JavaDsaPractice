package Array;

import java.util.Scanner;

public class SumOfTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n1=s.nextInt();
		int n2=s.nextInt();
		int a1[]=new int[n1];
		int a2[]=new int[n2];

		for(int i=0;i<n1;i++) {
			a1[i]=s.nextInt();
			
		}
		for(int i=0;i<n1;i++) {
			a2[i]=s.nextInt();
			
		}
		int[] output = new int[1 + Math.max(a1.length, a2.length)];

        sumOfTwoArrays(a1, a2, output);
        for (int element : output) {
            System.out.print(element + " ");
        }

        System.out.println();


	}
	 public static void sumOfTwoArrays(int arr1[], int arr2[], int ans[]) {
	    	//Your code goes here
	        int i=arr1.length-1;
	        int j=arr2.length-1;
	        int k=ans.length-1;
	        int carry=0;
	        while(k>=0){
	            int sum=0;
	            if(i>=0){
	                sum+=arr1[i];
	            }
	            if(j>=0){
	                sum+=arr2[j];
	            }
	            sum+=carry;
	            ans[k]=(sum%10);
	            carry=sum/10;
	            k--;
	            j--;
	            i--;
	        }
	    }

}
