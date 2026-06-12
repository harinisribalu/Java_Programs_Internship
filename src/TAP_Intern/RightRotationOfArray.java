package TAP_Intern;

import java.util.Scanner;

public class RightRotationOfArray {
 static Scanner sc= new Scanner(System.in);
 public static void main(String[]args) {
	 System.out.print("enter the size of array: ");
	 int n=sc.nextInt();
	 int k=sc.nextInt();
	 int[]arr=new int[n];
	 System.out.print("enter the  array: ");

	 for(int i=0;i<arr.length;i++) {
		 arr[i]=sc.nextInt();
	 }
	 for(int i=k+1;i<arr.length;i++) {
		System.out.print(arr[i]+" "); 
	 }
	 for(int i=0;i<=k;i++) {
		 System.out.print(arr[i]+" ");
	 }
 }
}
