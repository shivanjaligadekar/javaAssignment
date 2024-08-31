package Assignment1;

import java.util.Scanner;

public class Quetion2 {

	public static void main(String[] args) {
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		num=sc.nextInt();
		
		
		if(num>10 && num<=100)
			System.out.println("Number is 2 digit");
		else if(num>=100 && num<=999)
			System.out.println("Number is 3 digit");
		else
			System.out.println("Number is 4 digit");

	}

}
