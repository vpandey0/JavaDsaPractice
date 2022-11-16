package Strings;

import java.util.Scanner;

public class subString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn=new Scanner(System.in);
		String str=sn.nextLine();
		for(int len=1;len<=str.length();len++) {
			for(int start=0;start<=(str.length()-len);start++) {
				int end=start+len-1;
				System.out.println(str.substring(start,end+1));
			}
		}

	}

}
