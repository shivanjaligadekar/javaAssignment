package MyOOP;

public class Emp {
	private
	int Empid,salary;
	String name;
	public
	Emp()
	{
		Empid=201;
		name="Rama";
		salary=20000;	
		
	}
	void display_info() {
		System.out.println("Emp ID: " +Empid);
		System.out.println("Name: " +name);
		System.out.println("Salary: " +salary);
	}

}
