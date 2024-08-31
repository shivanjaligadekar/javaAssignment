package exception;

import java.util.Scanner;

class MyClass extends Exception{
	public MyClass(String msg) {//parametrized constructor
		super(msg);//calling the constructor of parent (Excetion) class
	}
}
public class UserDefinedException {

	public static void main(String[] args) {
	
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the password");
	String pass=sc.next();
	try {
		if(pass.length()<5) {
			throw new MyClass("Password can not be less than 5 characters...");
			//	   obj    constructor
		}
		else if(pass.matches("[A-za-z0-9]*")) {//* for multiple characters
			throw new MyClass("Password should have atleast one special  characters...");
		}else
			System.out.println("Password is valid...");
	}
	catch(Exception e) {
		System.out.println(e.getMessage());
	}

	}

}
