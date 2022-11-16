package Array;

import java.util.Scanner;

public class Array2d {
	public static void main(String[] args) 
	{ 
	    
	    Scanner s=new Scanner(System.in);
	    int[][] arr = new int [5][5];
//	    for (int i = 0; i < 2; i++) { 
//	        for (int j = 0; j < 2; j++) { 
//	            System.out.print(arr[i][j] + " "); 
//	        } 
//	    } 
	    for (int i = 0; i < 5; i++) { 
	        for (int j = 0; j < 5; j++) { 
	            arr[i][j]=s.nextInt();
	    } 
	    }
	        
			int sum=0;
			for(int i=0;i<5;i++){
				for(int j=0;j<5;j++){
					if((i==j) || (i+j==4)){
						sum+=arr[i][j];
					}
				}
			}
			System.out.print(sum);
			int colmin=0;
			int rowmin=0;
			int cMax=5;
			int rMax=5;
			for(int i=rowmin;i<5;i++) {
				if(i!=colmin)
				sum+=arr[i][colmin];
						
			}
			colmin++;
			for(int i=colmin;i<5;i++) {
				if(i!=rMax)
				sum+=arr[rMax][i];
						
			}
			rMax--;
			
			for(int i=rMax;i>=0;i--) {
				if((i+cMax)!=4) {
					sum+=arr[i][cMax];
				}
			}
			cMax--;
			for(int i=cMax;i>0;i--) {
				sum+=arr[rowmin][i];
			}
			
			System.out.print(sum);
	 
	}
}
