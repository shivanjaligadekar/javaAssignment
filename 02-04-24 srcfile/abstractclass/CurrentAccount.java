package abstractclass;

public class CurrentAccount {
	protected int id;
	protected float bal;
	

	public CurrentAccount(int id, float bal) {
		super();
		this.id = id;
		this.bal = bal;
	}
	
	public float calculateIntrest() {
		return(0.07f*bal);
	}
	public static void main(String[] args) {
		

	}

}
