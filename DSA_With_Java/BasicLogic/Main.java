package BasicLogic;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		// for Addition class
		System.out.println("Enter First number\n");
		int x= sc.nextInt();
		System.out.println("Enter secound number\n");
		int y= sc.nextInt();
		
		System.out.println("Addition is:-\t "+Addition.Add(x, y));
		
		// for Factorial class
		
		//System.out.println("Factorial is: "+Factorial.facto(6));
	}

}
