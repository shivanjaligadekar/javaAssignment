package dac;

import java.util.Scanner;

public class AgeMinorMajor {

	public static void main(String[] args) {
		 System.out.println("Enter age");
	       Scanner obj =new Scanner(System.in);
	       int age;
	       age=obj.nextInt();
	       
	       if(age>18)
		   System.out.println("Major");
	       else
	    	System.out.println("Minor");
		   }
	}


