package dac;

import java.util.Scanner;

public class ScanThreeNum {

	public static void main(String[] args) {
		System.out.println("Enter Three numbers");
	       Scanner obj =new Scanner(System.in);
	       int a,b,c;
	       a=obj.nextInt();
	       b=obj.nextInt();
	       c=obj.nextInt();
	       if(a>b)
	       {
	    	   System.out.println("A is largest no");
		       System.out.println("A="+a);
	       }
	       else
	    	   if(b>c)
	       {
	    	   System.out.println("B is largest no");
		       System.out.println("B="+b);
		   }
	     else
	     {
	    	 System.out.println("C is largest no");
		       System.out.println("C="+c); 
	     }

	}

}
