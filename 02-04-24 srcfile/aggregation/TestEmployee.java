package aggregation;

public class TestEmployee {

	public static void main(String[] args) {
		Address a1=new Address("pune", "maha", 412306);
		Address a2=new Address("nashik", "maha", 412308);
		Address a3=new Address("mumbai", "maha", 412305);
		
		
		Employee e1=new Employee(1, "sham", 200000, a1);
		Employee e2=new Employee(2, "ram", 500000, a1);
		Employee e3=new Employee(3, "hema", 800000, a1);
		
		System.out.println("calling the display method");
		e1.display();
		e2.display();
		e3.display();
		

	}

}
