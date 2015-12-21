public class Account {

	private int balance=0;
	
	public Account() {
		balance=0;
	}

	public Account(int initialAmount) {
		balance=initialAmount;
	}
	
	public void deposit(Integer amount) {
		balance=balance+amount;
	}
	
	public int getBalance() {
		return balance;
	}

}