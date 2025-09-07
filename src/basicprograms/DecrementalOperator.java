package basicprograms;

public class DecrementalOperator {

	public static void main(String[] args) {
		int a=9;
		a--;
		System.out.println(a);
		// post decrement
		int r=a--;
		System.out.println(r);
		System.out.println(a);
		// pre decrement
		r=--a;
		System.out.println(r);
	}

}
