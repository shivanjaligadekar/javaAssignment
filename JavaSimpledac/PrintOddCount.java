package dac;

import java.util.Scanner;

public class PrintOddCount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,n,cnt=0;
				
		System.out.println("Enter 5 numbers");
		
		
	
	for(a=1;a<=5;a++)
		{
		n=sc.nextInt();
		if(n%2!=0)
		{
			System.out.println(+a);
			cnt++;
		}
		
			
		}
	
	
	System.out.println("Total count"+cnt);
	}

}
