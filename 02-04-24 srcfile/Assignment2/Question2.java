package Assignment2;

import java.util.Scanner;

public class Question2 {
	int sum,total,dis=0;
	Scanner sc=new Scanner(System.in);
	int[] arr=new int[5];
	
	public void accept() {
		System.out.println("Enter 5 no");
		for(int i=0;i<5;i++) {
			arr[i]=sc.nextInt();	
		}
	}
	public void display()
	{
		System.out.println("=========================================================");
		System.out.println("displaying the array");
		for(int i=0;i<5;i++) {
		System.out.println(arr[i]);	
		sum+=arr[i];
		total=total+sum;
		dis=total*10/100;
		
	}
		System.out.println("sum is"+sum);
		System.out.println("total bill is"+total);
		System.out.println("disccount is"+dis);
	}

	public static void main(String[] args) {
		Question2 q=new Question2();
		q.accept();
		q.display();
		
	}

}
