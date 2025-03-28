package Array;
import java.util.*;

public class ReadWriteArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i,n,a[];
		
		System.out.println("Enter Size of Array: ");
		
		n=sc.nextInt();
		
		a=new int[n];
		
		System.out.println("Enter "+n+" elements");
		 for(i=0;i<n;i++){
			a[i]=sc.nextInt();
			
		 }
		 System.out.println("Array Elements are: ");
		 
		 for(i=0;i<n;i++) {
			 System.out.println("a["+i+"]="+a[i]);
		 }
		 System.out.println(" By Using For-Each loop ");
		 
		 for(int items:a) {
			 System.out.println(items);
		 }

	}

}
