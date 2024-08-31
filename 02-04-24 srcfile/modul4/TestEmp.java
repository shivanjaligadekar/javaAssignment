package modul4;

public class TestEmp {

	public static void main(String[] args) {
		System.out.println("this is my default constructor");
		Emp e=new Emp();
//		e.display();
		e.checkProject();
		
		
		System.out.println("=========================================");
		System.out.println("this is my parameteries constructor");
		Emp e1=new Emp(2,"raj",300000);
//		e1.display();
		e1.checkProject();
		

	}

}
