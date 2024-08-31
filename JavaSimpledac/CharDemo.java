import java.util.Scanner;
class CharDemo{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		System.out.println("Enter character");
		char ch = sc.next().charAt(0);
		System.out.println("Char:"+ch);
		String ss = sc.next();
		System.out.println("String:"+ss);
	}
	
}