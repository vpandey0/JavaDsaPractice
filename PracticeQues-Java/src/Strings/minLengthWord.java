package Strings;

import java.util.Scanner;

public class minLengthWord {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		
		int c=0;
		String s="";
		int min=Integer.MAX_VALUE;
		int stridx=0;
		int endIdx=0;
		while (endIdx<str.length()){
			
		c=0;
		
		if(str.charAt(stridx)!=' '){
			 c++;
		}
        int endIdx=stridx+c-1;
		if(min>c){
			min=c;
			s="";
			for(int j=stridx;j<=endIdx;j++){
				s+=str.charAt(j);
			}
		}

        System.out.print(s);

		}
		
	}
	
}
