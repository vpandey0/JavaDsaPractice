package Strings;

import java.util.Scanner;

public class reverseAnArr {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		String s2="";
		for(int i=0;i<str.length();i++) {
			s2=str.charAt(i)+s2;
		}
		
		System.out.println(s2);
		

	}

}
