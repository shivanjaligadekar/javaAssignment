package dac;

import java.util.Scanner;

public class Range {

	public static void main(String[] args) {
		int num;
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		if(1<num && num<250)
			
			System.out.println("Number is between 1-250");
		else if(251<num && num<500)
			System.out.println("Number is between 251-500");
		else if(501<num && num<750)
			System.out.println("Number is between 501-750");
	}
	}


