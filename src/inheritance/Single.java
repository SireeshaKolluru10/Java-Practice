package inheritance;
class SingleOne{
	int a=10;
	void display() {
		System.out.println(a);
		System.out.println("This is a parent class");
	}
}
class SingleTwo extends SingleOne{
	void print() {
		System.out.println("This is child class");
	}
}
public class Single {
	
public static void main(String[] args) {
	SingleTwo st=new SingleTwo();
	st.display();
	st.print();
}
}
