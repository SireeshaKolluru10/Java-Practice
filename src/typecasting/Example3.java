package typecasting;
 class Animal{
	 void m1() {
		 System.out.println("m1 method");
	 }
 }
 class Tiger extends Animal{
	 void m2() {
		 System.out.println("m2 method");
	 }
 }

public class Example3 {

	public static void main(String[] args) {
		Animal a=new Tiger();
		Tiger t=(Tiger)a; // down casting
		t.m1();
		t.m2();
		
	}

}
