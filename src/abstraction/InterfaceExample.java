package abstraction;
 interface Inter1{
	 int a=101; // variables are static and final
	 void m1(); // abstract method , by default abstract methods are public 
	default void m2(){
		System.out.println("This is default method in interface1"); 
	 } // only default and static methods are allowed in interfaces after java 8
	static void m3() {
		System.out.println("This is static method in interface1");
	}
	 
 }
public class InterfaceExample implements Inter1{
	public void m1() {
		System.out.println("This is abstract method from interface1");
	}
	
	public static void main(String[] args) {
		InterfaceExample ie=new InterfaceExample();
		ie.m1();
		ie.m2();
		Inter1.m3();// to access static methods from interface use interface name
		System.out.println(Inter1.a);
	}

}
