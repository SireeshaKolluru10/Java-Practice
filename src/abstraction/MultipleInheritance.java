package abstraction;
interface I1{
	int j=9;
	void shape();
	default void circle() {
		System.out.println("The shape is cicle");
	}
	static void square() {
		System.out.println("The shape is square");
	}
}
interface I2{
	String s="hello";
	default void triangle() {
		System.out.println("The shape is triangle");
	}
}
public class MultipleInheritance implements I1,I2{
 public void shape() {
	 System.out.println("This is the abstract method ");
 }
	 public static void main(String[] args) {
		 
		 MultipleInheritance m=new MultipleInheritance();
		 m.shape();
		 m.circle();
		 m.triangle();
		 I1.square();
		 System.out.println(I1.j);
		 System.out.println(I2.s);

	}

}
