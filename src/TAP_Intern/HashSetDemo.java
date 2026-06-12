package TAP_Intern;
import java.util.HashSet;
import java.util.Scanner;

public class HashSetDemo {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		String[]arr=new String[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.next();
		}
		//hash(arr,n);
		removeDuplicate(arr,n);
	}
	public static void hash(String[] arr, int n) {
		
		HashSet<String> hs = new HashSet<>();
		for(int i=0;i<arr.length;i++) {
			hs.add(arr[i]);
		}
		System.out.println(hs);
 	}
	public static void removeDuplicate(String[] arr, int n) {
		  for(int i=0;i<arr.length;i++) {
			  boolean duplicate=false;
			  for(int j=0;j<i;j++) {
				  if(arr[i].equals(arr[j])) {
					  duplicate=true;
					  break;
				  }
			  }
			  if(!duplicate) {
				  System.out.print(arr[i]+" ");
			  }
		  }
		
	}

}
