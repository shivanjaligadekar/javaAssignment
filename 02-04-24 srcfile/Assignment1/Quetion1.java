package Assignment1;
import java.util.Scanner;
public class Quetion1 {
	
	public static void main(String[] args) {
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		num=sc.nextInt();
		
		if(num<0)
			System.out.println("Number is +ve");
		else
			System.out.println("Number is -ve");
	}

}
