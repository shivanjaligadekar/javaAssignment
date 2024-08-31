package modul2;
import java.util.Scanner;
public class Circle {
	private int r;
	private double area1;
	private double peri;
	
	Scanner sc = new Scanner(System.in);
	final double PI=3.14;
	
	public void accept() {
		System.out.println("Enter the radius:");
		r=sc.nextInt();
	}
	public void calArea() {
		area1=PI*r*r;
	}
	public void calPeri() {
		peri=2*PI*r;
	}
	public void display() {
		System.out.println("radius is"+r);
		System.out.println("area is"+area1);
		System.out.println("perimeter is"+peri);
		
	}
	
	

}
