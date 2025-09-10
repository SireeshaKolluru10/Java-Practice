package finalkeyword;

final class RBI {
	final int max_amount = 100;
	double intrest_rate = 7;

	final void rate() {
		System.out.println(intrest_rate);
	}
}// we can't extend a class when it is final

/*
 * class SBI extends RBI{ 
 * double intrest_rate=7.5; //we can't override the method when it is final 
 * void rate() { 
 * System.out.println(super.intrest_rate);
 * System.out.println(max_amount); 
 * }
 * 
 * } 
 * class ICICI extends RBI{ 
 * double intrest_rate=7.9; 
 * void rate() {
 * System.out.println(intrest_rate); 
 * } 
 * }
 */
public class Bank {

	public static void main(String[] args) {
		//SBI s = new SBI();
		//s.rate();
		// s.max_amount=102; // we can't change the variable when it is final
	}

}
