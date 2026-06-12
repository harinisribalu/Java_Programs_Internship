package TAP_Intern;

import java.util.ArrayList;
import java.util.Scanner;

public class LeftRotationOfArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the array elements : ");
		for(int i=0 ;i<n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the target rotation : ");
		int k = sc.nextInt();
		leftRotation(arr, k);
	}
	public static void leftRotation(int[] arr, int k) {
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=k; i<arr.length; i++) {
			list.add(arr[i]);
		}
		for(int i=0; i<k; i++) {
			list.add(arr[i]);
		}
		System.out.println(list);
		
		
	}
	
}
