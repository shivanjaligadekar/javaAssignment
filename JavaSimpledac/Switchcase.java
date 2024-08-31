package dac;

import java.util.Scanner;

public class Switchcase {

	public static void main(String[] args) {
		 int ch,a, square, cube;
		System.out.println("Enter a choice");
		Scanner obj =new Scanner(System.in);
		  ch=obj.nextInt();
		System.out.println("Enter a number");
	    a=obj.nextInt();
	     
	       switch(ch)
	       {
	       case 1:
	    	   square=a*a;
	    	   System.out.println("Square="+square);
	    	   break;
	       case 2 :
	    	   cube=a*a*a;
	    	   System.out.println("Cube="+cube);
	    	   break;
	       default :
	    		 System.out.println("Invalid choice");
	    		
	       }
	}

}
