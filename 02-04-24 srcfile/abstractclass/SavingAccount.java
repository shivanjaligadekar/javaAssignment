package abstractclass;

public class SavingAccount {
	protected int id;
	protected float bal;
	

	public SavingAccount(int id, float bal) {
		super();
		this.id = id;
		this.bal = bal;
	}
	public float calculateIntrest() {
		return(0.056f*bal);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
