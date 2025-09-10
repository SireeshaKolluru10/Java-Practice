package thisandstatic;

public class ExampleMain {

	public static void main(String[] args) {
		ExampleThis e=new ExampleThis(12,13);
		e.m1(13, 14);// 13 and 14 are overriding the values in the constructor
		e.m2();
	}

}
