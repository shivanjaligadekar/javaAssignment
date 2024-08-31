package modul1;

public class TestEmp {

	public static void main(String[] args) {
		Emp E1=new Emp();
		E1.empNo=23;
		E1.ename="sham";
		E1.sal=200000;
		
		System.out.println("calling method");
		E1.display();
		E1.markAttendance();
		E1.checkProject();
		System.out.println("---------------------------------------");
		
		

	}
	
	
	
	

}
