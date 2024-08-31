package modul4;

public class TestEmp2 {

	public static void main(String[] args) {
		Emp e3=new Emp();
//		e3.display();
		
		
		e3.setEmpId(10);
		e3.setName("shiv");
		e3.setSal(20000);
		
		System.out.println("salary is"+e3.getSal());
		e3.setName("ritik");
		e3.setSal(300000);
		System.out.println("updated salary is"+e3.getSal());
		System.out.println("updated name is"+e3.getName());
		
		System.out.println(e3);
		Emp emp2=new Emp(2,"reva",30000);
		System.out.println(emp2);
		
//		e1.getEmpId();
//		e1.getName();
//		e1.getSal();

	}

}
