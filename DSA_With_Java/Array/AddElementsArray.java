package Array;
import java.util.*;
public class AddElementsArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int i,n,array[],sum=0;
		System.out.println("Enter size of the array: ");
		n=sc.nextInt();
		array=new int[n];
		System.out.println("Enter "+n+" Elements :- ");
		
		for(i=0;i<n;i++) {
			array[i]=sc.nextInt();
			sum=sum+array[i];
		}
		System.out.println("Elements of the array are :-");
			for(int items : array) {
				System.out.println(items);
			}
			System.out.println("Sum of elements =\t"+sum);
		

	}

}
