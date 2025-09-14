package typecasting;
class Sport{
	void m1() {
		System.out.println("m1 method from parent");
	}
}
class Cricket extends Sport{
	void m2() {
		System.out.println("m2 method from child");
	}
	
}
public class Example2 {

	public static void main(String[] args) {
		Sport s=new Cricket();// up casting
		s.m1();
	//	s.m2(); not valid
	}

}
