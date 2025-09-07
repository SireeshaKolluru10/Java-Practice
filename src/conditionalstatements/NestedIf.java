package conditionalstatements;

public class NestedIf {

	public static void main(String[] args) {
		int marks=87;
		if(marks>=90) {
			System.out.println("distinction");
		}else if(marks>=75) {
			System.out.println("first class");
		}else if (marks>=55) {
			System.out.println("second class");
		}
		else if(marks>=35) {
			System.out.println("passed");
		}else {
			System.out.println("failed");
		}
	}

}
