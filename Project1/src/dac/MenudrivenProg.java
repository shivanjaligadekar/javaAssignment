package dac;
import java.util.Scanner;
public class MenudrivenProg {
	public static void main(String[] args) {
			 int ch,a,b, Mult, Sub,Add;
			System.out.println("Enter a choice");
			Scanner obj =new Scanner(System.in);
			  ch=obj.nextInt();
			System.out.println("Enter two number");
		    a=obj.nextInt();
		    b=obj.nextInt();
		    //Mult=obj.nextInt();
		    //Sub=obj.nextInt();
		    //Add=obj.nextInt();
		       switch(ch)
		       {
		       case 1:
		    	   Mult=a*b;
		    	   System.out.println("Multiplication="+Mult);
		    	   break;
		       case 2 :
		    	   Sub=a-b;
		    	   System.out.println("Subtraction="+Sub);
		    	   break;
		       case 3 :
		    	   Add=a+b;
		    	   System.out.println("Addition="+Add);
		    	   break;
		       default :
		    		 System.out.println("Invalid choice");
		    		
		       }
		}

	}



