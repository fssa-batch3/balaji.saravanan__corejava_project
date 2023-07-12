package day05.practice;

public class BankDemo {
	public static void main(String[] args) throws Exception {

		Account accounttt = new Account("123458", 20000);

		ATM at = new AxisATM();

		ATM ic = new IciciATM();

		at.deposit(accounttt, 3000);

		ic.deposit(accounttt, 2000);

		at.withdraw(accounttt, 3000);

		ic.withdraw(accounttt, 2000);

		at.getBalance(accounttt);

		ic.getBalance(accounttt);
	}
}