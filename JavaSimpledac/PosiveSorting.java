package dac;

import java.util.Scanner;

public class PosiveSorting {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[],i,b[],j=0;
		a=new int[10];
		b=new int[10];
		System.out.println("Enter numbers");
		
			for(i=0;i<a.length;i++)
			{
			   a[i]=sc.nextInt();
			   if(a[i]>0)
			   {
				   b[j]=a[i];
				   j++;
			   }
			   
			}
			for(i=0;i<j;i++)
				 
			{
			  
				System.out.println("b["+i+"]="+b[i]);
				System.out.println("Count"+j);
			}
			
			
			
			//b[i]=sc.nextInt();
			
			
			  
			}
			
	}


