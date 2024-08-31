package aggregation;

public class Employee {
	private int empId;
	private String ename;
	private double sal;
	private Address address;
	public Employee(int empId, String ename, double sal, Address address) {
	
		this.empId = empId;
		this.ename = ename;
		this.sal = sal;
		this.address = address;
	}
	
	public void display() {
		System.out.println("empid is"+empId);
		System.out.println("ename is"+ename);
		System.out.println("salary is"+sal);
		System.out.println("address is"+address);
	}

}
