package assignment;

public class AccountQue7 {
	String accountNumber;
	double balance;

	public AccountQue7(String accountNumber) {
		this.accountNumber = accountNumber;
		balance = 0;
	}

	public void withDraw(double amt) {
		if (balance > amt) {
			balance -= amt;
			System.out.println(amt + " withdrawn successfully...");
			System.out.println("Remaining balance"+balance);
		} else {
			System.out.println("insufficient funds...");
		}
	}

	public void deposit(double amt) {
		balance += amt;
	}

	public double getBalance() {
		return balance;
	}

	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", balance=" + balance + "]";
	}
	
	

}



