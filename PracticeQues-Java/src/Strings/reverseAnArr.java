package Strings;

import java.util.Scanner;

public class reverseAnArr {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		String s2 = "";
		for (int i = 0; i < str.length(); i++) {
			s2 = str.charAt(i) + s2;
		}
		
		String string = "";
		int k = 0;
		for (int i = 0; i < s2.length(); i++) {

			if (s2.charAt(i) == ' ') {

				for (int j = i - 1; j >= k; j--) {
					string = string + s2.charAt(j);
				}
				string += " ";
				k = i + 1;
			}


		}
				
		for(int j=s2.length()-1;j>=k;j--) {
			string=string+s2.charAt(j);
		}

		System.out.println(string);

	}

}
