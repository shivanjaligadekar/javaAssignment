package abstractclass;

public class Employee {
	private String ename;

	public Employee(String ename) {
		super();
		this.ename = ename;
	}
	public String getName() {
		return ename;
	}
	public void setName(String ename) {
		System.out.println("Employee name is:"+ename);
	}

}
