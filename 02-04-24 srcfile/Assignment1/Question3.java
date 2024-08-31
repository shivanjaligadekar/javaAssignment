package Assignment1;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		int age;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		age=sc.nextInt();
		
		if(age>18)
			System.out.println("your are eligible to vote");
		else
			System.out.println("your are not eligible to vote");

	}

}
