package encapsulation;

public class Bank {

	public static void main(String[] args) {
		BankServer bs=new BankServer();
		bs.setAcc_no(101826353);
		bs.setC_name("Selim");
		bs.setBalance(892754.23);
		System.out.println(bs.getAcc_no());
		System.out.println(bs.getC_name());
		System.out.println(bs.getBalance());
	}

}
