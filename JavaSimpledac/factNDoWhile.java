package dac;
import java.util.Scanner;
public class factNDoWhile {

	public static void main(String[] args) {
		int a,fact=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value for a ");
		a=sc.nextInt();
		do {
			fact=fact*a;
			a--;
		}while(a>0);
		System.out.println("Fact="+fact);

	}

}
