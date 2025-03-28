package FundamentalClasses;

public class GetClassA {
	static void m1(Object obj) {
		String name =obj.getClass().getName();
		System.out.println("The passed object is of type: "+name);
	}

}
