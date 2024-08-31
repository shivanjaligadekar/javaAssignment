package dac;
import java.util.Scanner;
public class Ifelse {

	public static void main(String[] args) {
		
       System.out.println("Enter value of a");
       Scanner obj=new Scanner(System.in);
       int a;
       a=obj.nextInt();
       
       if(a>0)
	   System.out.println("A is positive Number");
       else
    	System.out.println("A is negative number");
	   }

}
