package abstraction;
interface In1{
	char a='a';
	void m1();
}
interface In2{
	void m2();
} 
class Parent{
	void m3() {
		System.out.println("This method is from parent class");
	}
}
public class HybridInheritance extends Parent implements In1,In2 {
	public void m1(){
		System.out.println("This abstract method is from In1");
	}
	public void m2() {
		System.out.println("This abstract method is from In2");
	}
	public static void main(String[] args) {
		HybridInheritance h=new HybridInheritance();
		h.m1();
		h.m2();
		h.m3();
		System.out.println(In1.a);
	}

}
