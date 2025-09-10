package polymorphism;

public class Addition {
	int a=10;
	int b=20;
	void add() {
		System.out.println(a+b);
	}
	void add(int a,int b) {
		System.out.println(a+b);
	}
	void add(int a,int b,int c) {
		System.out.println(a+b+c);
	}
	void add(int a, double b) {
		System.out.println(a+b);
	}
	void add(double b,int a) {
		System.out.println(a+b);
	}
}
