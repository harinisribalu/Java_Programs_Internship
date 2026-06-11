package TAP_Intern;

import java.util.Scanner;

public class Anagram {
public static void main(String[]args) {
	Scanner sc= new Scanner(System.in);
	System.out.print("enter the 1st string: ");
	String s1=sc.nextLine();
	System.out.print("enter the 2st string: ");
	String s2=sc.nextLine();
	System.out.print(anagram(s1, s2));
}
public static boolean anagram(String s1, String s2) {
	 if(s1.length()==s2.length()) {
		 return false;
	 }
	 int[] arr= new int[256];
	 for(int i=0;i<s1.length();i++) {
		 arr[s1.charAt(i)]++;
		 arr[s2.charAt(i)]--;
	 }
	 for(int i: arr) {
		 if(i!=0) {
			 return false;
		 }
	 }
	 return true;
}

}
