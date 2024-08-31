package dac;

import java.util.Scanner;

public class PrimeWhile {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,cnt=0,a=2;
			boolean ans=true;	
		System.out.println("Enter number    ");
		n=sc.nextInt();
		while(a<n)
		{
			
			
			if(n%a==0)
			
			{
				ans=false;
				break;
				
				
				
			}
			
			   a++;
			
		}
		System.out.println("Prime Number");

	}

}
