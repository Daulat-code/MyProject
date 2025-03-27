package FundamentalClasses;

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a1=new A(5);
		A a2=new A(5);
		A a3=new A(6);
		
		System.out.println("hashCode:  "+a1.hashCode());
		System.out.println("hashCode:  "+a2.hashCode());
		System.out.println("hashCode:  "+a3.hashCode());
		
		System.out.println("identityHashCode:  "+System.identityHashCode(a1));
		System.out.println("identityHashCode:  "+System.identityHashCode(a2));
		System.out.println("identityHashCode:  "+System.identityHashCode(a3));
		
		System.out.println("JVMHC:  "+a1.JVMHC());
		System.out.println("JVMHC:  "+a2.JVMHC());
		System.out.println("JVMHC:  "+a3.JVMHC());

	}

}
