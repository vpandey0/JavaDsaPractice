package Strings;

public class string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Coding";
//		String str2="aoding";
//		compareTo returns the difference of gap between the unmatched char's ascii value;
//		System.out.println(str.compareTo(str2));
//        System.out.println(str.contains("ing"));

//        String a ="abcd";
//        String b="abcdac";
//        The compareTo function returns the difference of length of strings when 
//        they are not equal.In case if the lengths are equal, then it returns the non-zero difference 
//        in ASCII values starting from 0th index to (n-1)st index and if all the indices of string are same, it returns 0. 
//        System.out.println(a.compareTo(b));

//		String str1="abc";//String Immutability
//		String str2=str1+"";
//		System.out.println(str2);
//		System.out.println(str1==str2);
//		String str1 = "abc";//str1 is equal to str2 because of the string Pool
//		String str2 = "abc";
//		String str3=new String("abc");//if we create string like this, content doesn't store in string pool but in heap
//		
//		if (str1 == str2) {
//			System.out.println("str1 and str2 are equal");
//		}
//		else if (str1 == str3) {
//			System.out.println("str1 and str3 are equal");
//		} 
//		else {
//			System.out.println("Both are not equal");
//		}

//		int arr1[]= {1,3};
//		int arr2[]= {1,3};
//		if(arr1==arr2) {
//			System.out.println("Both are equal");
//		}else {
//			System.out.println("Both are not equal");
//		}
		
		String str1="abc";
		String str2="";
		System.out.println(str1.contains(str2));

	}

}
