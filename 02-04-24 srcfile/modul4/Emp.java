package modul4;

public class Emp {
	private int empId;
	private String name;
	private double sal;
	
	public Emp() {
		empId=2;
		name="raj"; 
		sal=200000;
	}
	public Emp(int empId,String name,double sal) {
		this.empId=empId;
		this.name=name;
		this.sal=sal;
	}
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
//	public void display() {
//		System.out.println("empid is"+empId);
//		System.out.println("name is"+name);
//		System.out.println("salary is"+sal);
//	}
	public void checkProject() {
		System.out.println("checking the project");
	}
	@Override
	public String toString() {
		return "Emp [empId=" + empId + ", name=" + name + ", sal=" + sal + "]";
	}
	
		
	}


