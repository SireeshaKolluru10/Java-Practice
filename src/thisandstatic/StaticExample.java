package thisandstatic;

public class StaticExample {
	static int a=10;
	int b=20;
	static void m1() {
		System.out.println("This is static method");
		
	}
	void m2() {
		System.out.println("This is non static method");
		System.out.println(a+b);
	}
	
}
