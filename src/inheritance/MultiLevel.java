package inheritance;
class MultiOne{
	void show() {
		System.out.println("This is a main class");
	}
}
class MultiTwo extends MultiOne{
void display() {
	System.out.println("This is extended from main class");
}
}
class MultiThree extends MultiTwo{
	void print() {
		System.out.println("This is the child class");
	}
}
public class MultiLevel {

	public static void main(String[] args) {
		MultiThree mt=new MultiThree();
		mt.show();
		mt.display();
		mt.print();
	}

}
