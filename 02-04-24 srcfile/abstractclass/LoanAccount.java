package abstractclass;

public class LoanAccount {
	protected int id;
	protected float bal;
                 
	public LoanAccount(int id, float bal) {
		super();
		this.id = id;
		this.bal = bal;
	}
	public float calculateIntrest() {
		return(0.10f*bal);
	}
	public static void main(String[] args) {
	}

}
