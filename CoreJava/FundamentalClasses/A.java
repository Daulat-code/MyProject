package FundamentalClasses;

public class A {
	int x;
	A(int x){
		this.x=x;
	}
	public int hashCode() {
		return x;
	}
	public int JVMHC() {
		return super.hashCode();
	}

}
