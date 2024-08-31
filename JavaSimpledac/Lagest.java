package dac;

import java.util.Scanner;

public class Lagest {

	public static void main(String[] args) {
		System.out.println("Enter two numbers");
	       Scanner obj =new Scanner(System.in);
	       int a,b;
	       a=obj.nextInt();
	       b=obj.nextInt();
	       if(a>b)
	       {
	    	   System.out.println("a is largest no");
		       System.out.println("Value of a is="+a);
	       }
	       else
	       {
	    	   System.out.println("b is largest no");
		       System.out.println("Value of b is="+b);
		   }
	}

}
