package modul1;
import modul1.Emp;
import modul2.NoteBook;
public class TestEmp1 {

	public static void main(String[] args) {
		//creating obj for notebook
		
		NoteBook n=new NoteBook();
		n.display();
		n.createCraft();
		n.readPage();
		n.sketch();          

		Emp emp1=new Emp();
		emp1.accept();
		emp1.display();
		

	}

}
