package dac;

import java.util.Scanner;

public class WhileOddEven {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=1990,cnt=0;
				
		System.out.println("Enter years");
		
		while(a<2020)
		{
			
			a=sc.nextInt();
			if(a%4==0 || a%400==0)
			
			{
				System.out.println("Leap year="+a);
				
				cnt++;
				
			}
			
			   a++;
			
		}
		
		
		System.out.println("count="+cnt);
		

	}

}
