package dac;

import java.util.Scanner;

public class Forloop {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,n;
				
		System.out.println("Enter value for n");
		n=sc.nextInt();
		
	System.out.println("Series of odd no");
	for(a=1;a<=n;a=a+2)
		{
		
		System.out.println(+a);
			
			
		}
	System.out.println("Series of even no");
	for(a=2;a<=n;a=a+2)
	{
		
	
	System.out.println(+a);
		
		
	}
		
		
		

}
}
