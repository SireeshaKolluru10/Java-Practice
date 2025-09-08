package jumpingstatements;

public class BreakStatement {

	public static void main(String[] args) {
			int i=10;
			while(i<=20) {
				if(i==17) {
					break;
				}
				System.out.println(i);
				i++;
			}
	}

}
