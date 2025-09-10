package inheritance;
class SingleParent{
	void display() {
		System.out.println("This is the single parent");
	}
}
class ChildOne extends SingleParent{
	void show() {
		System.out.println("This is the child one of single parent");
	}
}
class ChildTwo extends SingleParent{
	void print() {
		System.out.println("This is the child two of the single parent");
	}
}
public class Hierarchical {

	public static void main(String[] args) {
		 ChildOne co=new ChildOne();
		 co.display();
		 co.show();
		 ChildTwo ct=new ChildTwo();
		 ct.display();
		 ct.print();
	}

}
