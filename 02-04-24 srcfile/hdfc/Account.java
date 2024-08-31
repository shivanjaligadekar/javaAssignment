package hdfc;

public class Account {
	private int accNo;
	private String accHolderName;
	private double bal;
	
	public Account() {
		accNo=38746985;
		accHolderName="rani";
		bal=10000000;
	}
	public Account(int accNo,String accHolderName,double bal) {
		this.accNo=accNo;
		this.accHolderName=accHolderName;
		this.bal=bal;
	}
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public String getAccHolderName() {
		return accHolderName;
	}
	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}
	public double getBal() {
		return bal;
	}
	public void setBal(double bal) {
		this.bal = bal;
	}
	//withdraw()
	public boolean witdraw(double amount) {
		if (amount<0) {
			System.out.println("witdraw amount can not be less");
			return false;
		}
		else if(bal<amount) {
			System.out.println("bal can not be less than amt");
			return false;
		}
		else {
			bal=bal-amount;
			return true;
		}	
	}
	//deposit()
	
	public boolean deposite(double amount) {
		if (amount<0) {
			System.out.println("deposite amount in the previous");
			return false;
		}
		else {
			bal=bal+amount;
			return true;
		}
		
	}
	//transfer
	public boolean transfer (Account account1,Account account2,double amt) {
		if(account1.getBal()<amt) {
			System.out.println("less founds are available");
			return false;
		}
        else {
			double bal1=account1.getBal();
			account1.setBal(bal1-amt);
			
			double bal2=account2.getBal();
			account2.setBal(bal2+amt);
			return true;
				
			}
		}
		
	
	
	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", accHolderName=" + accHolderName + ", bal=" + bal + "]";
	}
	

}
