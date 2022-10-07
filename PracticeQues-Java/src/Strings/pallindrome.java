package Strings;

import java.util.Scanner;

public class pallindrome {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
//		String s2="";
//		for(int i=0;i<str.length();i++) {
//			s2=str.charAt(i)+s2;
//		}
//		if(s2.equals(str)) {
//			System.out.println("It's Pallindrome!");
//		}
//		else {
//			System.out.println("It's not  Pallindrome!");
//		}
		
		
		int i=0;
        int j=str.length()-1;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)) {
            System.out.println("It's not Pallindrome!"); 
            break;
            }
            	else {
                i++;
                j--;
            	}
        }
		
	}

	}

