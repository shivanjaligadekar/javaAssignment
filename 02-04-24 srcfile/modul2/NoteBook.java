package modul2;

public class NoteBook {
	int noPage;
	int font;
	float height;
	int price;
	String quality;
	
	
	public void display() {
		System.out.println("No of page="+noPage);
		System.out.println("Font of page="+font);
		System.out.println("Height of page="+height);
		System.out.println("Price of book="+price);
		System.out.println("quality of page="+quality);
	}
	public void readPage() {
		System.out.println("Read the sentence");
	}
	public void writeText() {
		System.out.println("Write few sentence");
	}
	public void createCraft() {
		System.out.println("Create animal structure");
	}
	public void sketch() {
		System.out.println("Sketch animal structure");
	}

}
