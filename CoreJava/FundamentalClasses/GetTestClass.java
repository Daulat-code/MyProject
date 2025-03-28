package FundamentalClasses;

public class GetTestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="abc";
		Integer io=50;
		Object obj=new GetClassA();
		GetClassB b1=new GetClassB();
		GetClassB b2=new GetClassC();
		
		GetClassA.m1(s1);
		GetClassA.m1(io);
		GetClassA.m1(obj);
		GetClassA.m1(b1);
		GetClassA.m1(b2);
		
		

	}

}
