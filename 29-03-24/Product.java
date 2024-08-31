package Dacjava;

public class Product {
	private
	 int quantity;
	 String name;
	 float rate,amt;
	public
	Product(){
		
		name="Pen Drive";
		rate=500;
		
	}
	void set_Q(int q) {
		quantity=q;
		amt=rate*quantity;
	}
	void show() {
		System.out.println("Product Name:"+name);
		System.out.println("Rate:"+rate);
		System.out.println("Quantity:"+quantity);
		System.out.println("Amount:"+amt);
	}


}
