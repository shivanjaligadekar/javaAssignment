package dac;
import java.util.Scanner;
public class NestedforPattern {

	public static void main(String[] args) {
		int i,j,n;
		Scanner sc=new Scanner(System.in);
       System.out.println("Enter numbers");
       n=sc.nextInt();
       for(i=1;i<=n;i++)
       {
    	  
    	   for(j=1;j<=n;j++)
    	   {
    		   System.out.print(" "+i);
    		  
    	  
           }
    	   System.out.println( );
	   }
       
	   }
	}


