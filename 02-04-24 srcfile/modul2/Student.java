package modul2;
import java.util.Scanner;
public class Student {
	private int rollNo;
	private String name;
	private double score;
	
	Scanner sc=new Scanner(System.in);
	public void accept() {
		System.out.println("Enter the rollno,name &score:");
		rollNo=sc.nextInt();
		name=sc.next();                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               	System.out.println("Enter the score");
		score=sc.nextInt();	
	}
	public void display() {
		System.out.println("roll no is"+rollNo);
		System.out.println("name is"+name);
		System.out.println("score is"+score);
	}
	
	}


