package Assignment2;
import java.util.Scanner;
public class Factorial {
	int a,i,fact=1;
	
	public void accept() {
		System.out.println("Enter a Number:");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
	}
	public void display() {
		for(i=1;i<a;i++) {
			fact*=i;
		}
		System.out.println(fact);
	}

	public static void main(String[] args) {
		Factorial f1=new Factorial();
		f1.accept();
		f1.display();

	}

}
