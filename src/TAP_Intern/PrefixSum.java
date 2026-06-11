package TAP_Intern;
import java.util.*;

public class PrefixSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string array : ");
		String str1 = sc.nextLine();
		printDoublePrefixSum(str1);
	}
	private static void printDoublePrefixSum(String str1) {
		String res = str1.substring(1, str1.length()-1);
		String[] arr = res.split(",");
		ArrayList<Integer> list = new ArrayList<>();
		ArrayList<Integer> result = new ArrayList<>();
		for(int i=0; i<arr.length; i++) {
			list.add(Integer.parseInt(arr[i]));
		}
		int pro = 1;
		System.out.println(list);
		for(int i:list) {
			pro*=i;
		}
		for(int i:list) {
			result.add(pro/i);
		}
		System.out.println(result);
	}
}
