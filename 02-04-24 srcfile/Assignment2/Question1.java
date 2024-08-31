package Assignment2;

import java.util.Scanner;

import modul4.ArrayDemo;

public class Question1 {
	int sum;
	Scanner sc=new Scanner(System.in);
	int[] arr=new int[2];
	
	public void accept() {
		System.out.println("Enter 2 no");
		for(int i=0;i<2;i++) {
			arr[i]=sc.nextInt();	
		}
	}
	public void display() {
		
		System.out.println("=========================================================");
		System.out.println("displaying the array");
		for(int i=0;i<2;i++) {
		System.out.println(arr[i]);	
		sum+=arr[i];
		}
		System.out.println("sum is"+sum);
	
	    
}

	public static void main(String[] args) {
		ArrayDemo a1=new ArrayDemo();
		a1.accept();
		a1.display();

		
	}

}
