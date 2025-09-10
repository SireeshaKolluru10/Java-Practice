package thisandstatic;

public class ExampleThis {
	int a,b;
	ExampleThis(int a,int b){
		this.a=a;
		this.b=b;
	}
	void m1(int a,int b) {
		this.a=a;
		this.b=b;
	}
	void m2() {
		System.out.println(a+b);
	}
}
