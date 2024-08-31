package MyOOP;

public class product {
	
	private
	int quantity;
	float rate,amount;
	String name;
	public
	product()
	{
		name="Pendrive";
		rate=700;
		quantity=8;
	}
	void get_q(int q)
	{
		quantity=q;
		amount=rate*quantity;
	}
	void display()
	{
		System.out.println("Name: " +name);
		System.out.println("Rate: " +rate);
		System.out.println("Quantity: " +quantity);
		System.out.println("Amount: " +amount);
		System.out.println("\n");
	}

}
