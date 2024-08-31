package dac;

import java.util.Scanner;

public class MaxArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[],i,max=0,t=0;
		
		System.out.println("Enter numbers");
		a=new int[5];
		
			for(i=0;i<=4;i++)
			{
			   a[i]=sc.nextInt();
			   if(a[i]>max)
			   {
				   max=a[i];
					 t=i;
			   }
			   
			}
			for(i=0;i<=4;i++)
			{
			   System.out.println("a["+i+"]="+a[i]);
			
				
			
				 
			}
			 System.out.println("Maximum value="+max);
			
			 System.out.println("present at="+t);
	}

}
