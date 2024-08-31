package modul2;

public class TestNoteBook {

	public static void main(String[] args) {
		NoteBook n = new NoteBook();
		n.noPage = 200;
		n.font = 11;
		n.height = 5;
		n.price = 40;
		n.quality = "good";

		System.out.println("calling method");
		n.display();
		n.readPage();
		n.writeText();
		n.createCraft();
		n.sketch();
		System.out.println("=================================================");
		
		NoteBook n1 = new NoteBook();
		n1.noPage = 300;
		n1.font = 15;
		n1.height = 8;
		n1.price = 80;
		n1.quality = "good";

		System.out.println("calling method");
		n1.display();
		n1.readPage();
		n1.writeText();
		n1.createCraft();
		n1.sketch();
		System.out.println("=================================================");
		
		NoteBook n2 = new NoteBook();
		n2.noPage = 100;
		n2.font = 10;
		n2.height = 5;
		n2.price = 30;
		n2.quality = "good";

		System.out.println("calling method");
		n2.display();
		n2.readPage();
		n2.writeText();
		n2.createCraft();
		n2.sketch();
		System.out.println("=================================================");
		
		
		
	}
}
